/**
 * You are building a meeting scheduler system that allows users to schedule meetings within a working day (from 09:00 to 17:00). 
 * Users can submit multiple meetings, and your job is to check whether a new meeting request conflicts with any already scheduled meetings.
 * 
 * ✍️ Input
 * A list of already scheduled meetings, where each meeting is represented by a tuple of start and end time in 24-hour format strings, e.g., ("13:00", "14:30").
 * A new meeting request, also a tuple of start and end time, e.g., ("14:00", "15:00").
 * 
 * example
 * scheduled = [("09:30", "10:30"), ("12:00", "13:00"), ("16:00", "17:00")]
 * new_meeting = ("10:15", "11:00")
 * false
 */

type Meeting = [string, string]

type Scheduler = Meeting[];

function timeToMinutes(time: string): number {
    const [hours, minutes] = time.split(':').map(Number);
    return hours * 60 + minutes;
}


function canSchedule(scheduler: Scheduler, newMeeting: Meeting): boolean {
    const [newMeetingStart, newMeetingEnd] = newMeeting;
    const newMeetingStartMin = timeToMinutes(newMeetingStart);
    const newMeetingEndMin = timeToMinutes(newMeetingEnd);

    for(const [startMeeting, endMeeting] of scheduler) {
        const startMeetingMin = timeToMinutes(startMeeting);
        const endMeetingMin = timeToMinutes(endMeeting);

        if(newMeetingStartMin < endMeetingMin && newMeetingEndMin > startMeetingMin){
            return false;
        }

    }

    return true;
}
