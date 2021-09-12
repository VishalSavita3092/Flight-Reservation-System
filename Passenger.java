package com.upgrad.frs;

public class Passenger{
    private int id;
    private static int idcounter;

    public static class Address{
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getAddressDetails(){
            return this.street+"//"+this.city+"//"+this.state;
        }
        public void updateAddressDetails(String addressDetails){
            String[] arr = addressDetails.split("//");
            this.street=arr[0];
            this.city= arr[1];
            this.state= arr[2];
        }
    }
    private Address address;

    public static class Contact{
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String getContactDetails(){
            return this.name+"//"+this.phone+"//"+this.email;
        }
        public void updateContactDetails(String contactDetails){
            String[] contactArr =  contactDetails.split("//");
            this.name=contactArr[0];
            this.phone=contactArr[1];
            this.email=contactArr[2];
        }
    }


    private Contact contact;
    static {
        idcounter = 0;
    }

   public Passenger(String street, String city, String state,String name, String phone, String email){
        this.address =new Address(street,city,state);
        this.contact = new Contact(name,phone,email);
        this.id = ++idcounter;
   }
   public Address getAddress(){
        return this.address;
       }
    public Contact getContact(){
       return this.contact;
    }
}