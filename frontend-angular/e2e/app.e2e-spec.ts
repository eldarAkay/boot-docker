import { FrontendAngularPage } from './app.po';

describe('frontend-angular App', () => {
  let page: FrontendAngularPage;

  beforeEach(() => {
    page = new FrontendAngularPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
