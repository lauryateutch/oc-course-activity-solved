import com.openclassrooms.course.springboot.activitych3.Rent;
import com.openclassrooms.course.springboot.activitych3.RentsController;
import com.openclassrooms.course.springboot.activitych3.repository.RentRepository;
import com.openclassrooms.course.springboot.activitych3.service.CurrencyService;
import com.openclassrooms.course.springboot.activitych3.service.RentService;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class RentServiceTest {

    @InjectMocks
    private RentService rentServiceMock;
    @Mock
    private RentRepository rentRepositoryMock;
    @Mock
    private CurrencyService currencyServiceMock;


   /* public String testgetCityRent() {
        //arrange
       Rent rent1 = new Rent("1","londre","Angleterre","344444555");
        Rent rent2 = new Rent("1","YAOUNDE","CAMEROUN","345.6");


        List<Rent> mockItems = Arrays.asList(rent1, rent2);
        when(rentRepositoryMock.findByCity(rent1.getCity()).thenReturn(rent1);

        //Act
        List<Rent> result = rentServiceMock.getCityRent(rent1.getCity());

        //Assert
        assertTrue(result.size() == 2);
        assertTrue(result.get(0).getTitle().equals("star"));
        assertTrue(result.get(0).getTitle().equals("Star Treck"));


    }*/
}

