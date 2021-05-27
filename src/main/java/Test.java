import com.ivoronline.soap.GetPersonRequest;
import com.ivoronline.soap.GetPersonResponse;

public class Test {

  public static void main(String[] args) {

    GetPersonRequest  getPersonRequest = new GetPersonRequest();
                      getPersonRequest.setId(1);

    GetPersonResponse getPersonResponse = new GetPersonResponse();
                      getPersonResponse.setName("John");

    System.out.println(getPersonRequest.getId());
    System.out.println(getPersonResponse.getName());

  }

}
