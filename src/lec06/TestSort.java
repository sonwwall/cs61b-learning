package lec06;


public class TestSort {
    @Test
    public  void testSort(){


        String[] input={"bob","luka","c++ is so long","cat"};
        String[] expected={"cat","bob","luka","c++ is so long"};

        Sort.sort(input);

        assertThat(input).isEqualTo(expected);
    }
}