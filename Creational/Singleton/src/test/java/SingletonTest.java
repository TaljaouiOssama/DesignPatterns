import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {
    @Test
   public  void testSingleton(){
        Singleton s=Singleton.getInstance();
        s.setData("data1");
        Singleton s1=Singleton.getInstance();
        assertThat(s1.getData()).isEqualTo(s.getData());
    }

}
