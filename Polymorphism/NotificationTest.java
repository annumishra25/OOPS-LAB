class Notifier {

    public void send(String message) {
        System.out.println("General Alert: " + message);
    }


    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

   
    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }


    private void internalLog(String message) {
        System.out.println("Internal System Log: Notification archived -> " + message);
    }

    
    public void processAndLog(String message) {
        send(message); 
        internalLog(message); // Accesses private method internally
    }
}

class AppNotifier extends Notifier {
    public void showFunctionality() {
        System.out.println("--- AppNotifier accessing inherited methods ---");
        send("System Update");          
        send("Hello", "user@example.com");  
        send("Your OTP is 1234", 9876543210L);
    }
}

public class NotificationTest {
    public static void main(String[] args) {
        AppNotifier app = new AppNotifier();
        app.showFunctionality();
        
        System.out.println("\n--- Testing Indirect Private Access ---");
        app.processAndLog("User Login Detected");
    }
}