#  DEMOWEBSHOP PROJECT (https://shopdemo.e-junkie.com/)

## Introduction

This project is dedicated to conducting thorough testing of the DemoWebShop website, accessible at [[https://demowebshop.tricentis.com]([https://shopdemo.e-junkie.com/](https://shopdemo.e-junkie.com/))](https://demowebshop.tricentis.com). Our goal is to ensure a seamless and error-free user experience by identifying and documenting bugs, errors, and areas for improvement across various user actions and processes within the site.

## Test Environment

**URL:** ([https://shopdemo.e-junkie.com/](https://shopdemo.e-junkie.com/))]

## User Stories and Test Cases

### US_301
- **Objective:** E-junkie > adding e-book to a basket
- **Test Cases:**
  - User-friendly URL should be able to go to the e-junkie demo site.
  - Find the "Add Demo E-Book to Cart" button and click.
  - Verify that the demo e-book is successfully added to the basket.
  - Click to "Add Promo Code" button.
  - Enter an invalid (random) promotional code in the specified area.
  - Click to "Apply" button
  - Verify the "invalid promotional code" warning message is displayed.

### US_302 
- **Objective:** E-Junkie demo site with demo e-book purchasing and Debit Card "faulty payment".
- **Test Cases:**
  - I should successfully access the e-junkie demo site.
  - Find the "Add Demo E-Book to Cart" button and click.
  - Verify that the demo e-book is successfully added to the basket.
  - Find the "Pay Using Debit Card" option and click on the basket page.
  - There should be areas where email, name and debt card information (card number, expiration date, CVC) can be entered on the payment page.
  - Leave the e-mail address and other fields blank on the payment page.
  - Click the "Pay" button to complete the payment process.
  - Verify that during the payment process, "Invalid email" and "Invalid Billing Name" errors are displayed at the same time.
  
### US_303 
- **Objective:** Control of unsuccessful payment with Debit / Credit Card.
- **Test Case:**
  - Find the "Pay Using Debit Card" option and click on the basket page.
  - On the payment page, there should be areas where email, name and debt card information (card number, expiration date, CVC) on the card.
  - Fill in compulsory areas (email, confirm email, name on card etc.) on the payment page.
  - Enter "1111 1111 1111 1111" with an invalid credit card number during the payment process.
  - Click the "Pay" button to complete the payment process.
  - Verify that the message "Your card number is invalid" is displayed.

### US_304 
- **Objective:**  Payment and confirmation by Debit / Credit Card.
- **Test Cases:**
  - Find the "Pay Using Debit Card" option and click on the basket page.
  - On the payment page, there should be areas where email, name and debit card information on the card can be entered.
  - Fill in compulsory areas (email, confirm email, name on card etc.) on the payment page.
  -  During the payment process as a valid credit card number "4242 4242 4242 4242", expiration date: 12/2024 and CVV: 000.
  - Click the "Pay" button to complete the payment process.
  - As a result of the payment process, "Your name, your order has been approved. Thank you!" Verify that the message is displayed.
  - Name and surname information must be included in "name on card"

### US_205 Negative | Login
- **Objective:** Control of unsuccessful payment with Debit / Credit Card.
- **Test Cases:**
  - Login with incorrect password.
  - Login with unregistered email.

### US_206 Ordering
- **Objective:** Test the complete ordering process from product selection to checkout.
- **Test Cases:**
  - Place an order with a registered account.
  - Place an order as a guest.

### US_208 Negative | Using coupons and gift cards
- **Objective:** Verify the system's response to invalid or expired coupons and gift cards.
- **Test Cases:**
  - Apply an expired coupon code.
  - Apply a gift card with insufficient balance.

### US_209 Download the order history to the computer
- **Objective:** Ensure users can download their order history.
- **Test Case:** Download order history from the user profile.

## Contributors

This project is a collaborative effort, with valuable contributions from:

- [Ali Cömert](https://www.github.com/alicomert)
- [Emre Yavuz](https://www.github.com/emreyavvz)
- [Gencer Genç](https://www.github.com/GencerGnc)
- [Medine Özdil](https://www.github.com/mdnozdl)
- [Özgür Karakuş](https://www.github.com/ozgurrkarakus)

## Scenario Guidelines

For each user story, the testing team will follow these steps:

1. **Preparation:** Set up the testing environment and ensure all tools are ready.
2. **Execution:** Follow the steps outlined in the test cases, noting any discrepancies or issues.
3. **Documentation:** Log all findings with screenshots and detailed descriptions.
4. **Review:** The team will review all documented findings to identify patterns or systemic issues.
5. **Feedback:** Submit a report to the development team for review and action.

We aim to cover all critical paths a user might take, including both expected and unexpected behaviors, to ensure the platform is robust and user-friendly.
