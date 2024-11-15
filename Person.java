 public static class Person {
        protected String Name;
        protected String Address;

        public Person() {}

        public Person(String Name, String Address) {
            this.Name = Name;
            this.Address = Address;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getName() {
            return Name;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public String getAddress() {
            return Address;
        }
    }
