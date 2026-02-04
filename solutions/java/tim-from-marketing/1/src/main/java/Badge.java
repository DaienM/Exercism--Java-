class Badge {
    public String print(Integer id, String name, String department) {
       // If department is null, it's the owner
        String dept = (department == null) ? "OWNER" : department.toUpperCase();

        // If ID is null, omit it
        if (id == null) {
            return name + " - " + dept;
        } else {
            return "[" + id + "] - " + name + " - " + dept;
        }
        
    }
}
