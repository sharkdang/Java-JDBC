package Bai5;

public class CategoryManagement implements ICRUD{
    //Mảng chứa các đối tượng
    private Category [] categories = new Category[100];
    private int count = 0;

    public void addCategory(Category category){
        if(count < categories.length){
            categories[count++] = category;
        }else{
            System.out.println("Mảng đã đầy, không thể thêm danh mục.");
        }
    }
    //Trả về mảng trong danh mục
    public Category[] findAll() {
        Category[] result = new Category[count];
        System.arraycopy(categories, 0, result, 0, count);
        return result;
    }

    public void updateCategory(Category category) {
        for (int i = 0; i < count; i++) {
            if (categories[i].getId() == category.getId()) {
                categories[i] = category;
                return;
            }
        }
        System.out.println("Danh mục không tìm thấy.");
    }

    public void deleteById(int id) {
        for (int i = 0; i < count; i++) {
            if (categories[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    categories[j] = categories[j + 1]; // Dịch chuyển mảng
                }
                categories[--count] = null; // Giảm số lượng và xóa phần tử cuối
                System.out.println("Danh mục đã được xóa.");
                return;
            }
        }
        System.out.println("Không tìm thấy danh mục với ID: " + id);
    }

}
