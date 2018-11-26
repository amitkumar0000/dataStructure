package problems;

public class GreedyProblems {

    /*
    N Meeting in a Room :-
    Given start time and finish time of N meeting.
    How many meeting can be schedule in a Room.

    This is Greedy Activity Selection Problems. Sort the array based on finish time.
    Select first meeting, select next meeting based on condition
    its start time is >= finish time of previously selected meeting.
     */

    public int getMaxMeetingScheduleInRoom(int[] st, int[] et){
        return 0;
    }

    /*
    Minimum no of platform.
    Given Arrival and Departure time of train of a given day.
    Get minimum of platform required so no train wait for each other

    sort the at and dt in single array.
    calculate how many at comes together before dt time. that is answer.
     */
    public int getMinPlatform(int[] at, int[] dt) throws Exception {
        throw new Exception("method not implemented");
    }

    /*
    Job Sequencing Problems
    Given a array of job with deadline and profits
    It is given that every jobs take a single unit of time, so minimum possible deadline for any job is 1.

    ans:- sort the array in max profit in descending order.
          and put the first job in max slot say max profit jobs has deadline 4. Put this job in 4th slot.
     */
    public int getJobSequencingDeadline(){

        return 0;
    }
}
