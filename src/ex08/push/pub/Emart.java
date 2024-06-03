package ex08.push.pub;

import ex08.polling.LotteMart;
import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class Emart implements Mart{

    private List<Customer> customerList = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customerList.add(customer); // 구독
    }

    @Override
    public void received() {
        for (int i = 0; i < 15; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //..... 알림
            notify("Emart : 딸기");
        }
    }

    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> {
            customer.update(msg);
        });
    }
}
