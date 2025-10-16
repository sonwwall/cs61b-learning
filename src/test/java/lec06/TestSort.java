package lec06;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class TestSort {
    @Test
    public  void testSort(){


        String[] input={"bob","luka","c++ is so long","cat"};
        String[] expected={"bob","c++ is so long","cat","luka"};

        Sort.sort(input);

        assertThat(input).isEqualTo(expected);
    }
}
