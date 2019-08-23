package net.authorize.sample.PaymentTransactions;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import net.authorize.api.contract.v1.ANetApiResponse;
import net.authorize.api.contract.v1.CreateTransactionRequest;
import net.authorize.api.contract.v1.CreateTransactionResponse;
import net.authorize.api.contract.v1.CreditCardType;
import net.authorize.api.contract.v1.MerchantAuthenticationType;
import net.authorize.api.contract.v1.MessagesType;
import net.authorize.api.contract.v1.PaymentType;
import net.authorize.api.contract.v1.TransactionRequestType;
import net.authorize.api.contract.v1.TransactionTypeEnum;
import net.authorize.api.controller.CreateTransactionController;
import net.authorize.api.controller.base.ApiOperationBase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

@RunWith(PowerMockRunner.class)
public class AuthorizeCreditCardTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @PrepareForTest({ANetApiResponse.class, MessagesType.class, ApiOperationBase.class,
                   MerchantAuthenticationType.class, TransactionRequestType.class, BigDecimal.class,
                   CreateTransactionRequest.class, CreditCardType.class, System.class,
                   PaymentType.class, CreateTransactionController.class, AuthorizeCreditCard.class,
                   TransactionTypeEnum.class})
  @Test
  public void
  runInputNullNullZeroOutputIndexOutOfBoundsException() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final CreateTransactionResponse createTransactionResponse =
        PowerMockito.mock(CreateTransactionResponse.class);
    PowerMockito.whenNew(CreateTransactionResponse.class)
        .withNoArguments()
        .thenReturn(createTransactionResponse);
    final CreateTransactionController createTransactionController =
        PowerMockito.mock(CreateTransactionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(createTransactionController, getApiResponseMethod)
        .withNoArguments();
    final ANetApiResponse aNetApiResponse = PowerMockito.mock(ANetApiResponse.class);
    final MessagesType messagesType1 = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList1 = new ArrayList();
    final Method getMessageMethod1 = DTUMemberMatcher.method(MessagesType.class, "getMessage");
    PowerMockito.doReturn(arrayList1).when(messagesType1, getMessageMethod1).withNoArguments();
    final MessagesType messagesType = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList = new ArrayList();
    arrayList.add(0);
    arrayList.add(0);
    final Method getMessageMethod = DTUMemberMatcher.method(MessagesType.class, "getMessage");
    PowerMockito.doReturn(arrayList).when(messagesType, getMessageMethod).withNoArguments();
    final Method getMessagesMethod = DTUMemberMatcher.method(ANetApiResponse.class, "getMessages");
    ((PowerMockitoStubber)PowerMockito.doReturn(messagesType).doReturn(messagesType1))
        .when(aNetApiResponse, getMessagesMethod)
        .withNoArguments();
    final Method getErrorResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getErrorResponse");
    PowerMockito.doReturn(aNetApiResponse)
        .when(createTransactionController, getErrorResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(CreateTransactionController.class)
        .withParameterTypes(CreateTransactionRequest.class)
        .withArguments(
            or(isA(CreateTransactionRequest.class), isNull(CreateTransactionRequest.class)))
        .thenReturn(createTransactionController);
    final CreateTransactionRequest createTransactionRequest =
        PowerMockito.mock(CreateTransactionRequest.class);
    PowerMockito.whenNew(CreateTransactionRequest.class)
        .withNoArguments()
        .thenReturn(createTransactionRequest);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    final Method setScaleMethod =
        DTUMemberMatcher.method(BigDecimal.class, "setScale", int.class, RoundingMode.class);
    PowerMockito.doReturn(null)
        .when(bigDecimal, setScaleMethod)
        .withArguments(anyInt(), or(isA(RoundingMode.class), isNull(RoundingMode.class)));
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(bigDecimal);
    final PaymentType paymentType = PowerMockito.mock(PaymentType.class);
    PowerMockito.whenNew(PaymentType.class).withNoArguments().thenReturn(paymentType);
    final CreditCardType creditCardType = PowerMockito.mock(CreditCardType.class);
    PowerMockito.whenNew(CreditCardType.class).withNoArguments().thenReturn(creditCardType);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    final TransactionRequestType transactionRequestType =
        PowerMockito.mock(TransactionRequestType.class);
    PowerMockito.whenNew(TransactionRequestType.class)
        .withNoArguments()
        .thenReturn(transactionRequestType);
    thrown.expect(IndexOutOfBoundsException.class);
    AuthorizeCreditCard.run(null, null, 0.0);
  }

  @PrepareForTest({MessagesType.class, CreateTransactionResponse.class, ApiOperationBase.class,
                   MerchantAuthenticationType.class, TransactionRequestType.class, BigDecimal.class,
                   CreateTransactionRequest.class, CreditCardType.class, System.class,
                   PaymentType.class, CreateTransactionController.class, AuthorizeCreditCard.class,
                   TransactionTypeEnum.class})
  @Test
  public void
  runInputNullNullZeroOutputIndexOutOfBoundsException3() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final CreateTransactionResponse createTransactionResponse =
        PowerMockito.mock(CreateTransactionResponse.class);
    PowerMockito.whenNew(CreateTransactionResponse.class)
        .withNoArguments()
        .thenReturn(createTransactionResponse);
    final CreateTransactionController createTransactionController =
        PowerMockito.mock(CreateTransactionController.class);
    final CreateTransactionResponse createTransactionResponse1 =
        PowerMockito.mock(CreateTransactionResponse.class);
    final MessagesType messagesType1 = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList = new ArrayList();
    final Method getMessageMethod = DTUMemberMatcher.method(MessagesType.class, "getMessage");
    PowerMockito.doReturn(arrayList).when(messagesType1, getMessageMethod).withNoArguments();
    final MessagesType messagesType = PowerMockito.mock(MessagesType.class);
    final Method getResultCodeMethod = DTUMemberMatcher.method(MessagesType.class, "getResultCode");
    PowerMockito.doReturn(null).when(messagesType, getResultCodeMethod).withNoArguments();
    final Method getMessagesMethod =
        DTUMemberMatcher.method(CreateTransactionResponse.class, "getMessages");
    ((PowerMockitoStubber)PowerMockito.doReturn(messagesType).doReturn(messagesType1))
        .when(createTransactionResponse1, getMessagesMethod)
        .withNoArguments();
    final Method getTransactionResponseMethod =
        DTUMemberMatcher.method(CreateTransactionResponse.class, "getTransactionResponse");
    PowerMockito.doReturn(null)
        .when(createTransactionResponse1, getTransactionResponseMethod)
        .withNoArguments();
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getApiResponse");
    PowerMockito.doReturn(createTransactionResponse1)
        .when(createTransactionController, getApiResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(CreateTransactionController.class)
        .withParameterTypes(CreateTransactionRequest.class)
        .withArguments(
            or(isA(CreateTransactionRequest.class), isNull(CreateTransactionRequest.class)))
        .thenReturn(createTransactionController);
    final CreateTransactionRequest createTransactionRequest =
        PowerMockito.mock(CreateTransactionRequest.class);
    PowerMockito.whenNew(CreateTransactionRequest.class)
        .withNoArguments()
        .thenReturn(createTransactionRequest);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    final Method setScaleMethod =
        DTUMemberMatcher.method(BigDecimal.class, "setScale", int.class, RoundingMode.class);
    PowerMockito.doReturn(null)
        .when(bigDecimal, setScaleMethod)
        .withArguments(anyInt(), or(isA(RoundingMode.class), isNull(RoundingMode.class)));
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(bigDecimal);
    final PaymentType paymentType = PowerMockito.mock(PaymentType.class);
    PowerMockito.whenNew(PaymentType.class).withNoArguments().thenReturn(paymentType);
    final CreditCardType creditCardType = PowerMockito.mock(CreditCardType.class);
    PowerMockito.whenNew(CreditCardType.class).withNoArguments().thenReturn(creditCardType);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    final TransactionRequestType transactionRequestType =
        PowerMockito.mock(TransactionRequestType.class);
    PowerMockito.whenNew(TransactionRequestType.class)
        .withNoArguments()
        .thenReturn(transactionRequestType);
    thrown.expect(IndexOutOfBoundsException.class);
    AuthorizeCreditCard.run(null, null, 0.0);
  }

  @PrepareForTest({ANetApiResponse.class, MessagesType.class, ApiOperationBase.class,
                   MerchantAuthenticationType.class, TransactionRequestType.class, BigDecimal.class,
                   CreateTransactionRequest.class, CreditCardType.class, System.class,
                   PaymentType.class, CreateTransactionController.class, AuthorizeCreditCard.class,
                   TransactionTypeEnum.class})
  @Test
  public void
  runInputNullNullZeroOutputNull() throws Exception {
    PowerMockito.mockStatic(ApiOperationBase.class);
    final String apiLoginId = null;
    final String transactionKey = null;
    final Double amount = 0.0;
    final CreateTransactionResponse createTransactionResponse =
        PowerMockito.mock(CreateTransactionResponse.class);
    PowerMockito.whenNew(CreateTransactionResponse.class)
        .withNoArguments()
        .thenReturn(createTransactionResponse);
    final CreateTransactionController createTransactionController =
        PowerMockito.mock(CreateTransactionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(createTransactionController, getApiResponseMethod)
        .withNoArguments();
    final ANetApiResponse aNetApiResponse = PowerMockito.mock(ANetApiResponse.class);
    final MessagesType messagesType = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList = new ArrayList();
    final Method getMessageMethod = DTUMemberMatcher.method(MessagesType.class, "getMessage");
    PowerMockito.doReturn(arrayList).when(messagesType, getMessageMethod).withNoArguments();
    final Method getMessagesMethod = DTUMemberMatcher.method(ANetApiResponse.class, "getMessages");
    PowerMockito.doReturn(messagesType).when(aNetApiResponse, getMessagesMethod).withNoArguments();
    final Method getErrorResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getErrorResponse");
    PowerMockito.doReturn(aNetApiResponse)
        .when(createTransactionController, getErrorResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(CreateTransactionController.class)
        .withParameterTypes(CreateTransactionRequest.class)
        .withArguments(
            or(isA(CreateTransactionRequest.class), isNull(CreateTransactionRequest.class)))
        .thenReturn(createTransactionController);
    final CreateTransactionRequest createTransactionRequest =
        PowerMockito.mock(CreateTransactionRequest.class);
    PowerMockito.whenNew(CreateTransactionRequest.class)
        .withNoArguments()
        .thenReturn(createTransactionRequest);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    final Method setScaleMethod =
        DTUMemberMatcher.method(BigDecimal.class, "setScale", int.class, RoundingMode.class);
    PowerMockito.doReturn(null)
        .when(bigDecimal, setScaleMethod)
        .withArguments(anyInt(), or(isA(RoundingMode.class), isNull(RoundingMode.class)));
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(bigDecimal);
    final PaymentType paymentType = PowerMockito.mock(PaymentType.class);
    PowerMockito.whenNew(PaymentType.class).withNoArguments().thenReturn(paymentType);
    final CreditCardType creditCardType = PowerMockito.mock(CreditCardType.class);
    PowerMockito.whenNew(CreditCardType.class).withNoArguments().thenReturn(creditCardType);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    final TransactionRequestType transactionRequestType =
        PowerMockito.mock(TransactionRequestType.class);
    PowerMockito.whenNew(TransactionRequestType.class)
        .withNoArguments()
        .thenReturn(transactionRequestType);
	  Assert.assertNull(AuthorizeCreditCard.run(apiLoginId, transactionKey, amount));
  }

  @PrepareForTest({ANetApiResponse.class, MessagesType.class, ApiOperationBase.class,
                   MerchantAuthenticationType.class, TransactionRequestType.class, BigDecimal.class,
                   CreateTransactionRequest.class, CreditCardType.class, System.class,
                   PaymentType.class, CreateTransactionController.class, AuthorizeCreditCard.class,
                   TransactionTypeEnum.class})
  @Test
  public void
  runInputNullNullZeroOutputNullPointerException() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final CreateTransactionResponse createTransactionResponse =
        PowerMockito.mock(CreateTransactionResponse.class);
    PowerMockito.whenNew(CreateTransactionResponse.class)
        .withNoArguments()
        .thenReturn(createTransactionResponse);
    final CreateTransactionController createTransactionController =
        PowerMockito.mock(CreateTransactionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(createTransactionController, getApiResponseMethod)
        .withNoArguments();
    final ANetApiResponse aNetApiResponse = PowerMockito.mock(ANetApiResponse.class);
    final MessagesType messagesType1 = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(null);
    final Method getMessageMethod1 = DTUMemberMatcher.method(MessagesType.class, "getMessage");
    PowerMockito.doReturn(arrayList1).when(messagesType1, getMessageMethod1).withNoArguments();
    final MessagesType messagesType = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method getMessageMethod = DTUMemberMatcher.method(MessagesType.class, "getMessage");
    PowerMockito.doReturn(arrayList).when(messagesType, getMessageMethod).withNoArguments();
    final Method getMessagesMethod = DTUMemberMatcher.method(ANetApiResponse.class, "getMessages");
    ((PowerMockitoStubber)PowerMockito.doReturn(messagesType).doReturn(messagesType1))
        .when(aNetApiResponse, getMessagesMethod)
        .withNoArguments();
    final Method getErrorResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getErrorResponse");
    PowerMockito.doReturn(aNetApiResponse)
        .when(createTransactionController, getErrorResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(CreateTransactionController.class)
        .withParameterTypes(CreateTransactionRequest.class)
        .withArguments(
            or(isA(CreateTransactionRequest.class), isNull(CreateTransactionRequest.class)))
        .thenReturn(createTransactionController);
    final CreateTransactionRequest createTransactionRequest =
        PowerMockito.mock(CreateTransactionRequest.class);
    PowerMockito.whenNew(CreateTransactionRequest.class)
        .withNoArguments()
        .thenReturn(createTransactionRequest);
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    final Method setScaleMethod =
        DTUMemberMatcher.method(BigDecimal.class, "setScale", int.class, RoundingMode.class);
    PowerMockito.doReturn(null)
        .when(bigDecimal, setScaleMethod)
        .withArguments(anyInt(), or(isA(RoundingMode.class), isNull(RoundingMode.class)));
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(bigDecimal);
    final PaymentType paymentType = PowerMockito.mock(PaymentType.class);
    PowerMockito.whenNew(PaymentType.class).withNoArguments().thenReturn(paymentType);
    final CreditCardType creditCardType = PowerMockito.mock(CreditCardType.class);
    PowerMockito.whenNew(CreditCardType.class).withNoArguments().thenReturn(creditCardType);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    final TransactionRequestType transactionRequestType =
        PowerMockito.mock(TransactionRequestType.class);
    PowerMockito.whenNew(TransactionRequestType.class)
        .withNoArguments()
        .thenReturn(transactionRequestType);
    thrown.expect(NullPointerException.class);
    AuthorizeCreditCard.run(null, null, 0.0);
  }
}
