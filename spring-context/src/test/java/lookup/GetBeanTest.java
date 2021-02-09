package lookup;

/**
 * @author linShengJie
 * @date 2021/2/9 12:03
 */
public abstract class GetBeanTest {

	public void showMe(){
		this.getBean().showMe();
	}

	public abstract User getBean();
}
