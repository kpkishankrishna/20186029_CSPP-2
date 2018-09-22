class Task {
    private String tasktitle;
    private String nameofperson;
    private int minutes;
    private boolean important;
    private boolean urgent;
    private String status;
    Task() {

    }
    Task(String tasktitle, String nameofperson, int minutes, boolean important, boolean urgent, String status) throws Exception {
            if (tasktitle.equals("")) {
                throw  new Exception("title not provided");

        } else {
                    this.tasktitle = tasktitle;
        }
        this.nameofperson = nameofperson;
            if (minutes >= 0) {
        this.minutes = minutes;
        }
        else {
            throw new Exception("Invalid timeToComplete " + minutes);
        }

        this.important = important;
        this.urgent = urgent;
            if (status.equals("done") || status.equals("todo")) {
            this.status = status;   
        
        } else 
        {
            throw new Exception("Invalid status " + status);
        }

    }
    public String tasktitle () {
        return tasktitle;
    }
    public String nameofperson() {
        return nameofperson;
    }
    public int minutes() {
        return minutes;
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
        String s = tasktitle + ", " + nameofperson + ", " + minutes + ", " + b + ", " + a + ", " + status;
        return s;
    }
}
