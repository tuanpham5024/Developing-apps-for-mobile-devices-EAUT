package com.company.test;

import com.company.io.SerialzeFileFactory;
import com.company.model.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestCustomer {

    static ArrayList<Customer> customers = new ArrayList<Customer>();
    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("CUSTOMER MANAGER");
        System.out.println("1. Nhập khách hàng");
        System.out.println("2. Xuất khách hàng");
        System.out.println("3. Tìm kiếm khách hàng");
        System.out.println("4. Sắp xếp khách hàng");
        System.out.println("5. Lưu khách hàng");
        System.out.println("6. Đọc khách hàng từ file");
        System.out.println("7. Phân tích");
        System.out.println("8. Thoát");
        System.out.println("Vui lòng chọn chức năng: ");
        int choice = 0;

        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> inputCustomer();
            case 2 -> outputCustomer();
            case 3 -> searchCustomer();
            case 4 -> sortCustomer();
            case 5 -> saveCustomer();
            case 6 -> readCustomers();
            case 7 -> analysis();
            case 8 -> exitCustomerManager();
            default -> {
            }
        }
    }

    private static void exitCustomerManager() {
        System.exit(0);
    }

    private static void analysis() {
        int n = 0;
        for (Customer customer: customers) {
            if(customer.getPhone().startsWith("098")) {
                n++;
            }
        }
        System.out.println("Có " + n + " khách hàng viettel");
    }

    private static void readCustomers() {
        customers = SerialzeFileFactory.readFile("/Users/macos/Downloads/Developing-apps-for-mobile-devices-EAUT/ExerciseOOP/CustomerManager/src/com/company/data/customers.txt");
    }

    private static void saveCustomer() {
        boolean check = SerialzeFileFactory.saveFile(customers, "/Users/macos/Downloads/Developing-apps-for-mobile-devices-EAUT/ExerciseOOP/CustomerManager/src/com/company/data/customers.txt");
        if (check) {
            System.out.println("Lưu file thành công");
        } else {
            System.out.println("Lưu file thất bại");
        }
    }

    private static void sortCustomer() {
        Collections.sort(customers);
    }

    private static void searchCustomer() {
        String phone = "090";
        for (Customer customer : customers) {
            if (customer.getPhone().startsWith(phone)) {
                System.out.println(customer);
            }
        }
    }

    private static void outputCustomer() {
        System.out.println("=====================");
        System.out.println("ID\tTên\tSố điện thoại");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("=====================");
    }

    private static void inputCustomer() {
        Customer customer = new Customer();
        System.out.println("Nhập mã khách hàng: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        name = scanner.nextLine();
        System.out.println("Nhập số điện thoại khách hàng");
        String phone = scanner.nextLine();

        customer.setId(id);
        customer.setName(name);
        customer.setPhone(phone);

        customers.add(customer);
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
