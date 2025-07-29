/** 
 * 3[a]2[bc]
 * aaabcbc
 * 
 * 3[a2[c]]
 * accaccacc
 * */ 

function decodeString(s: string): string {
    const countStack: number[] = [];
    const stringStack: string[] = [];
    let currentStr = '';
    let k = 0;

    for (const char of s) {
        if (!isNaN(Number(char))) {
            k = k * 10 + Number(char);
        } else if (char === '[') {
            countStack.push(k);
            stringStack.push(currentStr);
            // reset 
            k = 0;
            currentStr = '';
        } else if (char === ']') {
            // pop last string and repeat count
            const repeatTimes = countStack.pop()!;
            const prevStr = stringStack.pop()!;
            currentStr = prevStr + currentStr.repeat(repeatTimes);
        } else {
            currentStr += char;
        }
    }

    return currentStr;
}
