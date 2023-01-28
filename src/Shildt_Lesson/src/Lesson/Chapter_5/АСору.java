package Shildt_Lesson.src.Lesson.Chapter_5;
// Пример использования переменной length для копирогвания массивов
 class АСору {
    public static void main(String[] args) {
        int i;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for(i = 0; i < nums1.length; i++){
            nums1[i] = i;
        }

        //Копирование массива nums1 в массив nums2
        if(nums2.length >= nums1.length){
            for(i = 0; i < nums2.length; i++){
                nums2[i] = nums1[i];
            }
        }
        for(i = 0; i < nums2.length; i++){
            System.out.println(nums2[i] + " ");
        }
    }
}

/*
* В данном примере переменная экземпляра length помогает решить две
важные задачи. Во-первых, она позволяет убедиться в том, что размера целе-
вого массива достаточно для хранения содержимого исходного массива. И во-
вторых, с ее помощью формируется условие завершения цикла, в котором вы-
полняется копирование массива.
* */