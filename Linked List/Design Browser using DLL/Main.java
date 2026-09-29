class Node{
    String data;
    Node back;
    Node next;

    public Node(String data) {
        this.data = data;
        this.back = null;
        this.next = null;
    }
}

class BrowserHistory {
    Node currentPage;
    public BrowserHistory(String homepage) {
        currentPage = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        currentPage.next = newNode;
        newNode.back = currentPage;
        currentPage = newNode;
    }
    
    public String back(int steps) {
        while(steps > 0){
            if(currentPage.back != null){
                currentPage = currentPage.back;
            }else{
                break;
            }
            steps--;
        }
        return currentPage.data;
    }
    
    public String forward(int steps) {
        while(steps > 0){
            if(currentPage.next != null){
                currentPage = currentPage.next;
            }else{
                break;
            }
            steps--;
        }
        return currentPage.data;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create BrowserHistory with homepage
        BrowserHistory browser = new BrowserHistory("leetcode.com");

        System.out.println("Initial Page: leetcode.com");

        // Visit pages
        browser.visit("google.com");
        System.out.println("Visit: google.com");

        browser.visit("facebook.com");
        System.out.println("Visit: facebook.com");

        browser.visit("youtube.com");
        System.out.println("Visit: youtube.com");

        // Go back
        String page = browser.back(1);
        System.out.println("Back 1 step: " + page);

        // Go back again
        page = browser.back(1);
        System.out.println("Back 1 step: " + page);

        // Go forward
        page = browser.forward(1);
        System.out.println("Forward 1 step: " + page);

        // Visit another page
        browser.visit("github.com");
        System.out.println("Visit: github.com");

        // Try forward
        page = browser.forward(2);
        System.out.println("Forward 2 steps: " + page);

        // Go back multiple steps
        page = browser.back(2);
        System.out.println("Back 2 steps: " + page);

        // Go forward multiple steps
        page = browser.forward(1);
        System.out.println("Forward 1 step: " + page);
    }
}