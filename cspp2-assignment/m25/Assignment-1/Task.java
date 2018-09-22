class Task {
    private String title;
    private String assignedTo;
    private int timeToComplete;
    private boolean important;
    private boolean urgent;
    private String status;
    Task() {

    }
    Task(String title, String assignedTo, int timeToComplete, boolean important, boolean urgent, String status) throws Exception {
            if (title.equals("")) {
                throw  new Exception("Title not provided");

        } else {
                    this.title = title;
        }
        this.assignedTo = assignedTo;
/*      try {*/
            if (timeToComplete >= 0) {
        this.timeToComplete = timeToComplete;
        }
        else {
            throw new Exception("Invalid timeToComplete " + timeToComplete);
        }
/*  } catch(Exception e) {
        System.out.println("Invalid timeToComplete " + timeToComplete);
    }*/
        this.important = important;
        this.urgent = urgent;
            if (status.equals("done") || status.equals("todo")) {
            this.status = status;   
        
        } else 
        {
            throw new Exception("Invalid status " + status);
        }
/*  } catch(Exception e) {
        System.out.println("Invalid status " + status);
    }*/
    }
    public String title () {
        return title;
    }
    public String assignedTo() {
        return assignedTo;
    }
    public int timeToComplete() {
        return timeToComplete;
    } 
    public String important() {
        String b = "";
        if (important) {
            b = "Important";
        } else {
            b = "Not Important";
        }
        return b;
    }
    public String urgent() {
        String a = "";
        if (urgent) {
            a = "Urgent";
        } else {
            a = "Not Urgent";
        }
        return a;
    }
    public String status() {
        return status;
    }
    public String toString() {
        String a = "";
        String b = "";
        if (urgent) {
            a = "Urgent";
        } else {
            a = "Not Urgent";
        }
        if (important) {
            b = "Important";
        } else {
            b = "Not Important";
        }
        String s = title + ", " + assignedTo + ", " + timeToComplete + ", " + b + ", " + a + ", " + status;
        return s;
    }
}
