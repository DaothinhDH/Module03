package baitap1;

public class TaoThreadDonGian implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            // In ra số và thông tin của thread đang chạy
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);

            try {
                // Dừng thread trong 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // In ra thông báo khi thread hoàn thành
        System.out.println("Thread " + Thread.currentThread().getName() + " finished.");
    }

    public static void main(String[] args) {
        // Tạo hai đối tượng NumberGenerator
        TaoThreadDonGian generator1 = new TaoThreadDonGian();
        TaoThreadDonGian generator2 = new TaoThreadDonGian();

        // Tạo hai đối tượng Thread tương ứng với mỗi NumberGenerator
        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Thay đổi priority của thread
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // Bắt đầu thực thi hai thread
        thread1.start();
        thread2.start();
    }
}