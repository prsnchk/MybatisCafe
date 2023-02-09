import model.*;
import service.*;

public class Main {

    public static void main(String[] args) {
        //PaymentType
        PaymentTypeService paymentTypeService = new PaymentTypeService();
        //GET
        PaymentType paymentType2 = paymentTypeService.getPaymentTypeById(2);
        System.out.println(paymentType2);
        //SAVE
        PaymentType paymentType3 = new PaymentType(3, "GooglePay");
        paymentTypeService.insertPaymentType(paymentType3);
        //GET ALL
        System.out.println(paymentTypeService.getAllPaymentType());
        //EDIT
        paymentType3.setName("ApplePay");
        paymentTypeService.updatePaymentType(paymentType3);
        System.out.println(paymentTypeService.getPaymentTypeById(3));
        //DELETE
        paymentTypeService.deletePaymentType(paymentType3);
        System.out.println(paymentTypeService.getAllPaymentType().toString());

        //CAFE
        CafeService cafeService = new CafeService();
        //GET
        Cafe cafe2 = cafeService.getCafeById(2);
        System.out.println(cafe2);
        //SAVE
        Cafe cafe4 = new Cafe(4, "Osmantus");
        cafeService.insertCafe(cafe4);
        //GET ALL
        System.out.println(cafeService.getAllCafe());
        //EDIT
        cafe4.setCafeName("Comfort Town");
        cafeService.updateCafe(cafe4);
        System.out.println(cafeService.getCafeById(4));
        //DELETE
        cafeService.deleteCafe(cafe4);

        //Courier
        CourierService courierService = new CourierService();
        //GET
        Courier courier2 = courierService.getCourierById(2);
        System.out.println(courier2);
        //SAVE
        Courier courier5 = new Courier(5, "Володимир", "Зеленський");
        courierService.insertCourier(courier5);
        //GET All
        System.out.println(courierService.getAllCourier());
        //EDIT
        courier5.setLastName("Осел");
        courierService.updateCourier(courier5);
        System.out.println(courierService.getCourierById(5));
        //DELETE
        courierService.deleteCourier(courier5);

        //Customer
        CustomerService customerService = new CustomerService();
        //GET
        Customer customer2 = customerService.getCustomerById(2);
        System.out.println(customer2);
        //SAVE
        Customer customer5 = new Customer(5, "Поплава", "Ніякая", "0933981409", "kdnjkksjsk@gmail.com");
        customerService.insertCustomer(customer5);
        //GET ALL
        System.out.println(customerService.getAllCustomer());
        //EDIT
        customer5.setSecondName("Нелюбячая");
        customerService.updateCustomer(customer5);
        System.out.println(customerService.getCustomerById(5));
        //DeLEtE
        customerService.deleteCustomer(customer5);

        //MenuItems
        MenuItemsService menuItemsService = new MenuItemsService();
        //GET
        MenuItems menuItems2 = menuItemsService.getMenuItemsById(2);
        System.out.println(menuItems2);
        //Save
        MenuItems menuItems5 = new MenuItems(5, "Гусениця", "Gusenitsya", 140);
        menuItemsService.insertMenuItems(menuItems5);
        //Get all
        System.out.println(menuItemsService.getAllMenuItems());
        //edit
        menuItems5.setPrice(140);
        menuItemsService.updateMenuItems(menuItems5);
        System.out.println(menuItemsService.getMenuItemsById(5));
        //delete
        menuItemsService.deleteMenuItems(menuItems5);
    }
}
