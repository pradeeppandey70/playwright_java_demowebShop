package factory;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LocatorFactory {
	private final Page page;
	
	public LocatorFactory(Page page) {
		this.page = page;
	}
	
	public Locator text(String text) {
		return page.getByText(text);
	}
	
	public Locator testid(String id) {
		return page.getByTestId(id);
	}
	
	public Locator label(String label) {
		return page.getByLabel(label);
	}
	
	public Locator placeholder(String placeholder) {
		return page.getByPlaceholder(placeholder);
	}
	
	public Locator role(AriaRole role, String text) {
		return page.getByRole(role, new Page.GetByRoleOptions().setName(text));
	}
	
	public Locator xpath(String xpath) {
		return page.locator(xpath);
	}
	
	public Locator css(String css) {
		return page.locator(css);
	}

}
