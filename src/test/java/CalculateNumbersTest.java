import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class CalculateNumbersTest {
    //    given
    CalculateNumbers calculateNumbers = new CalculateNumbers();

    @Test
    public void shouldReturnDifferentFor100Elements() {
        //when
        int result = calculateNumbers.CalculateElements(100);
        // then
        Assert.assertThat(result, CoreMatchers.is(25164150));
    }

    @Test
    public void shouldReturnDifferentFor10Elements() {
        //when
        int result = calculateNumbers.CalculateElements(10);
        // then
        Assert.assertThat(result, CoreMatchers.is(2640));
    }

    @Test
    public void shouldReturnDifferentFor1Elements() {
        //when
        int result = calculateNumbers.CalculateElements(1);
        // then
        Assert.assertThat(result, CoreMatchers.is(0));
    }
    @Test
    public void shouldReturnDifferentForLessElements() {
        //when
        int result = calculateNumbers.CalculateElements(-1);
        // then
        Assert.assertThat(result, CoreMatchers.is(0));
    }
}
