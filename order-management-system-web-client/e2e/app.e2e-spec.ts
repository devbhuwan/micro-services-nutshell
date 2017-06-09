import { OrderManagementSystemWebClientPage } from './app.po';

describe('order-management-system-web-client App', () => {
  let page: OrderManagementSystemWebClientPage;

  beforeEach(() => {
    page = new OrderManagementSystemWebClientPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
