package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class simplestproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiscussionBoard myBoard = new DiscussionBoard();

        System.out.println("=== Forum Discussion Board Login ===");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Role (Admin/Member): ");
        String role = sc.nextLine();

        User currentUser = new User(name, role);
        currentUser.showInfo();

        boolean run = true;
        while (run) {
            System.out.println("\nMENU: [1] New Post  [2] View Board  [3] Exit");
            System.out.print("Choice: ");
            String choice = sc.nextLine();

            try {
                if (choice.equals("1")) {
                    System.out.print("Enter Title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter Content: ");
                    String c = sc.nextLine();

                    Post p = new Post(t, c, currentUser.username);
                    myBoard.addPost(p);

                } else if (choice.equals("2")) {
                    myBoard.showAllPosts();

                } else if (choice.equals("3")) {
                    System.out.println("Exiting System...");
                    run = false;
                } else {
                    System.out.println("Invalid Option.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("(!) Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}

// DISCUSSION BOARD CLASS
class DiscussionBoard {
    ArrayList<Post> postList = new ArrayList<>();

    public void addPost(Post p) {
        postList.add(p);
        System.out.println(">>> System: Post published successfully.");
    }

    public void showAllPosts() {
        System.out.println("\n--- FORUM DISCUSSION BOARD ---");
        if (postList.isEmpty()) {
            System.out.println("[Board is empty]");
        } else {
            for (Post p : postList) {
                System.out.println("TITLE: " + p.title);
                System.out.println("BY: " + p.author);
                System.out.println("CONTENT: " + p.content);
                System.out.println("----------------------------");
            }
        }
    }
}

// POST CLASS
class Post {
    String title;
    String content;
    String author;

    public Post(String title, String content, String author) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Post title cannot be empty!");
        }
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

// USER CLASS
class User {
    String username;
    String role;

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public void showInfo() {
        System.out.println("Active User: " + username + " (" + role + ")");
    }
}

// ADMIN CLASS
class Admin extends User {
    public Admin(String username) {
        super(username, "Admin");
    }

    public void getPermissions() {
        System.out.println("User [" + username + "] can Post, Comment, and Delete content.");
    }
}

// MEMBER CLASS
class Member extends User {
    public Member(String username) {
        super(username, "Member");
    }

    public void getPermissions() {
        System.out.println("User [" + username + "] can Post and Comment.");
    }
}

