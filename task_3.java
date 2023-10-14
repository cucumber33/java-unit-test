@RunWith(Parameterized.class)  // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;

  }

 @Parameterized.Parameters  // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		 // Заполни массив тестовыми данными и ожидаемым результатом
                {60, true},
 
                {15, false},
                {45, true},
               
                {14, false},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	// Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Результат выполнения теста", result, isAdult);
	}
}
