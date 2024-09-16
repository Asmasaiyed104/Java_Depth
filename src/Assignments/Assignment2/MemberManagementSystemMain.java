package Assignments.Assignment2;
public class MemberManagementSystemMain {

    public static void main(String[] args) {
        // Create an instance of MemberManagementSystem
        MemberManagementSystem system = new MemberManagementSystem(1234, "Asma");

        // Add a member to the system
        system.addMember(1234, "Asma");
        system.addMember(2234,"Fayza");

        // Display all members in the system
        for (int i = 0; i < MemberManagementSystem.memberCount; i++) {
            System.out.println("Name : " + MemberManagementSystem.members[i].name + " | Member ID : " + MemberManagementSystem.members[i].memberId);
        }

        // Find a member by ID and display their details
        // int index = system.findMemberById(1234);
        int index = system.findMemberById(2234);
        if (index != -1) {
            system.displayMemberDetails(index);
        }
    }
}
