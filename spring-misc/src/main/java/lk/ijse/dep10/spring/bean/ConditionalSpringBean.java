package lk.ijse.dep10.spring.bean;

import lk.ijse.dep10.spring.dto.CustomerDTO;
import lk.ijse.dep10.spring.util.MyCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@Conditional(MyCondition.class)
public class ConditionalSpringBean {

    public ConditionalSpringBean(@Value("some string") String myStr,
                                 @Value("10") int myInt,
                                 @Value("12.25") double myDouble,
                                 @Value("true") boolean myBool,
                                 @Value("1,2,3,4,5") int[] nums,
                                 @Value("#{'some string'}") String myStr2,
                                 @Value("#{10}") int myInt2,
                                 @Value("#{10.25}") double myDouble2,
                                 @Value("#{true}") boolean myBool2,
                                 @Value("#{{1,2,3,4,5}}") int[] nums2
    ) {
        System.out.println("---------------------");
        System.out.println("ConditionalSpringBean()");
        System.out.println("Basic Injections ----------");
        System.out.println(myStr);
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myBool);
        System.out.println(Arrays.toString(nums));
        System.out.println("SpEL Injections ----------");
        System.out.println(myStr2);
        System.out.println(myInt2);
        System.out.println(myDouble2);
        System.out.println(myBool2);
        System.out.println(Arrays.toString(nums2));
        System.out.println("---------------------");
    }

    public ConditionalSpringBean(
            @Value("#{{1,2,3,4,5}}") int[] nums,
            @Value("#{{'Kasun', 'Nuwan', 'Ruwan'}}") List<String> nameList,
            @Value("#{{'Galle', 'Panadura', 'Matara', 'Galle'}}") Set<String> addressSet,
            @Value("#{{1:'abc', 2:'edf', 3:'kkk'}}") Map<Integer, String> myMap,
            @Value("#{T(lk.ijse.dep10.spring.util.AppUtil).add(10,20)}") int sum,
            @Value("#{@springBean.nameList}") List<String> someRandomNameList,
            @Value("#{@springBean.customerList.?[address eq 'Galle']}") List<CustomerDTO> galleCustomerList) {
        System.out.println("---------------------");
        System.out.println("ConditionalSpringBean()");
        System.out.println("SpEL Injections ----------");
        System.out.println(Arrays.toString(nums));
        System.out.println(nameList);
        System.out.println(addressSet);
        System.out.println(myMap);
        System.out.println(sum);
        System.out.println(someRandomNameList);
        System.out.println(galleCustomerList);
        System.out.println("---------------------");
    }

    @Autowired
    public ConditionalSpringBean(@Value("${app.env1}") String appEnv1,
                                 @Value("${app.env2}") String appEnv2,
                                 @Value("${USER}") final String USER,
                                 @Value("${java.io.tmpdir}") String tempDirPath){
        System.out.println("---------------------");
        System.out.println("ConditionalSpringBean()");
        System.out.println("Env Injections ----------");
        System.out.println(appEnv1);
        System.out.println(appEnv2);
        System.out.println(USER);
        System.out.println(tempDirPath);
        System.out.println("---------------------");
    }
}
