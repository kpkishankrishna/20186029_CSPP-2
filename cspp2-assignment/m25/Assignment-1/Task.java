class Task {
	/**
	 * tasktitle
	 */
    private String tasktitle;
    /**
     * name
     */
    private String nameofperson;
    /**
     * time
     */
    private int minutes;
    /**
     * important
     */
    private boolean important;
    /**
     * urgent
     */
    private boolean urgent;
    /**
     * status
     */
    private String status;
    /**
     * Constructs the object.
     */
    Task() {

    }
    /**
     * 
     *
     * @param      tasktitle     The tasktitle
     * @param      nameofperson  The nameofperson
     * @param      minutes       The minutes
     * @param      important     The important
     * @param      urgent        The urgent
     * @param      status        The status
     */
    Task(String tasktitle, String nameofperson, int minutes, boolean important, boolean urgent, String status) throws Exception {
            if (tasktitle.equals("")) {
                throw  new Exception("Title not provided");

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
    /**
     * tasttitle
     *
     * @return     { description_of_the_return_value }
     */
    public String tasktitle () {
        return tasktitle;
    }
    /**
     * reurn name of person
     *
     * @return     { description_of_the_return_value }
     */
    public String nameofperson() {
        return nameofperson;
    }
    /**
     * return time
     *
     * @return     { description_of_the_return_value }
     */
    public int minutes() {
        return minutes;
    } 
    /**
     * return important
     *
     * @return     { description_of_the_return_value }
     */
    public String important() {
        String b = "";
        if (important) {
            b = "Important";
        } else {
            b = "Not Important";
        }
        return b;
    }
    /**
     * return urgent.
     *
     * @return     { description_of_the_return_value }
     */
    public String urgent() {
        String a = "";
        if (urgent) {
            a = "Urgent";
        } else {
            a = "Not Urgent";
        }
        return a;
    }
    /**
     * reurn status.
     *
     * @return     { description_of_the_return_value }
     */
    public String status() {
        return status;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
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
class Todoist {
    private Task[] objectsoftask;
    private int sizeofobject;
    Todoist() {
        objectsoftask = new Task[1];
        sizeofobject = 0;

    }
    private void resize() {
        Task[] newset = new Task[2 * objectsoftask.length];
        System.arraycopy(objectsoftask, 0, newset, 0, objectsoftask.length);
        objectsoftask = newset;
    }
    public void addTask(Task t) {
        if (sizeofobject == objectsoftask.length) {
            resize();
            addTask(t);
        } else {

            objectsoftask[sizeofobject++] = t;
        }
    }
    
    
    public void finalObject() {
        Task[] newset = new Task[sizeofobject];
        for(int i = 0; i < sizeofobject; i++) {
            newset[i] = objectsoftask[i];
        }
        objectsoftask = newset;
    }
    public String toString() {
        String str = "";
        finalObject();
        for (int i =0; i <objectsoftask.length; i++) {
            System.out.println(objectsoftask[i]);
        }
        return "";
  }
  	// public int totalTime4Completion() {
   //      finalObject();
   //      int total = 0;

   //      for (int i =0; i <tasks.length; i++) { 
   //          String z = tasks[i].status();
   //          if (z.equals("todo")) {
   //          total += tasks[i].timeToComplete();
   //      }
   //      }
   //      return total;
   //    }
 }
