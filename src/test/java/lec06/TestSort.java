package lec06;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class TestSort {
    @Test//每一个测试函数都单独写一个@Test标志
    public  void testSort(){


        String[] input={"cat","luka","c++ is so long","bob"};
        String[] expected={"bob","c++ is so long","cat","luka"};

        Sort.sort(input);

        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void testFindSmallest(){
        String[] input={"cat","luka","c++ is so long","bob"};
        int expect=3;

        int actual=Sort.findSmallest(input,0);
        assertThat(actual).isEqualTo(expect);

        int expect2=3;
        int actual2=Sort.findSmallest(input,2);
        assertThat(actual2).isEqualTo(expect2);
    }

    @Test
    //测试交换方法
    public void testSwap(){
        String[] input={"cat","luka","c++ is so long","bob"};
        String[] expected={"bob","luka","c++ is so long","cat"};

        Sort.swap(input,0,3);
        assertThat(input).isEqualTo(expected);
    }

}
