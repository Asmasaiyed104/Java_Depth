package Assignments.Assignment2;

public class MemberManagementSystem {

    // Properties
    int memberId;
    String name;

    static final int max_memSystem = 100;
    static int memberCount = 0;

    // Constructor
    // it will initialize with member id and name , go to the object of Membernamgement system in static class,the add memeber, then go to method of addMeber
    public MemberManagementSystem(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Static array of objects

    // Initialize the array with max_memSystem size
    static  MemberManagementSystem[] members = new  MemberManagementSystem [max_memSystem];

    // Methods
    //  it will initialize with constructor for method, the check condition,add member id and name,if true codition added member, false codition then add sout cannot add members
    // same for second member add process
    public  static void addMember(int memberId, String name) {
        if (memberCount < max_memSystem) {
            members[memberCount] = new MemberManagementSystem(memberId, name);
            memberCount++;
            System.out.println("Member added : " + name);

        } else {
            System.out.println("Cannot add more members.");
        }
    }
    // in find method same initialize , go to for loop, check condition if memeber id given match with memberid, member found else not found
    public int  findMemberById(int memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].memberId == memberId) {
                System.out.println("Member found: ");
                System.out.println("Name : " + members[i].name);
                System.out.println("MemberId : " + members[i].memberId);

                return i;
            }
        }
        System.out.println("Member with MemberID " + memberId + " not found.");
        return -1;
    }
    // simple  displaymember after checking condition in sout
    public void displayMemberDetails(int memberIndex) {
        if (memberIndex >= 0 && memberIndex < memberCount) {
            System.out.println("Name   : " + members[memberIndex].name);
            System.out.println("MemberID  : " + members[memberIndex].memberId);
        } else {
            System.out.println("Invalid member index.");
        }
    }
}
