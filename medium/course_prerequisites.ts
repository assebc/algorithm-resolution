/**
 * 
    Course Prerequisites
    Problem:
    Given numCourses and a list of prerequisite pairs, return whether it's possible to finish all courses.

 * canFinish(2, [[1, 0]]) ➞ true
 * canFinish(2, [[1, 0], [0, 1]]) ➞ false
 */

// (n, [[a, b]]) == b to a

function canFinish(numCourses: number, prerequisites: number[][]): boolean {
    const graph: number[][] = Array.from({ length: numCourses }, () => []);
    for ( const [course, pre] of  prerequisites) {
        if (course < 0 || course >= numCourses || pre < 0 || pre >= numCourses) {
            return false;
        }
        graph[pre].push(course);
    }

    // 0 = unvisited, 1 = visiting, 2 = visited
    const visitState = new Array(numCourses).fill(0);

    function dfs(course: number): boolean {
        if (visitState[course] === 1) { return false; } // cycle
        if (visitState[course] === 2) { return true; } // already processed

        // init visiting
        visitState[course] = 1;
        for(const nextCourse of graph[course]) {
            if (!dfs(nextCourse)) { return false; }
        }

        // visited all possible nodes from this node
        visitState[course] = 2;
        return true;
    }

    // loop through course until numCourses - 1 
    // it's ok if they don't exist 
    for (let course = 0; course < numCourses; course++) {
        if (visitState[course] === 0) {
            if (!dfs(course)) { return false; }
        }
    }
    

    return true; // edge case no cycle
}
