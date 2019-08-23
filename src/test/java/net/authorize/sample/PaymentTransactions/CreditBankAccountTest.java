package net.authorize.sample.PaymentTransactions;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import net.authorize.api.contract.v1.BankAccountType;
import net.authorize.api.contract.v1.CreateTransactionRequest;
import net.authorize.api.contract.v1.CreateTransactionResponse;
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
public class CreditBankAccountTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @PrepareForTest({MessagesType.class, CreateTransactionResponse.class, ApiOperationBase.class,
                   CreateTransactionRequest.class, BigDecimal.class,
                   MerchantAuthenticationType.class, TransactionRequestType.class,
                   CreditBankAccount.class, System.class, BankAccountType.class,
                   CreateTransactionController.class, TransactionTypeEnum.class, PaymentType.class})
  @Test
  public void
  runInputNullNullNullZeroOutputIndexOutOfBoundsException4() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final CreateTransactionController createTransactionController =
        PowerMockito.mock(CreateTransactionController.class);
    final CreateTransactionResponse createTransactionResponse =
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
        .when(createTransactionResponse, getMessagesMethod)
        .withNoArguments();
    final Method getTransactionResponseMethod =
        DTUMemberMatcher.method(CreateTransactionResponse.class, "getTransactionResponse");
    PowerMockito.doReturn(null)
        .when(createTransactionResponse, getTransactionResponseMethod)
        .withNoArguments();
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getApiResponse");
    PowerMockito.doReturn(createTransactionResponse)
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
    final BankAccountType bankAccountType = PowerMockito.mock(BankAccountType.class);
    PowerMockito.whenNew(BankAccountType.class).withNoArguments().thenReturn(bankAccountType);
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
    CreditBankAccount.run(null, null, null, 0.0);
  }

  @PrepareForTest({ApiOperationBase.class, CreateTransactionRequest.class, BigDecimal.class,
                   MerchantAuthenticationType.class, TransactionRequestType.class,
                   CreditBankAccount.class, System.class, BankAccountType.class,
                   CreateTransactionController.class, TransactionTypeEnum.class, PaymentType.class})
  @Test
  public void
  runInputNullNullNullZeroOutputNull() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final CreateTransactionController createTransactionController =
        PowerMockito.mock(CreateTransactionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(CreateTransactionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
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
    final BankAccountType bankAccountType = PowerMockito.mock(BankAccountType.class);
    PowerMockito.whenNew(BankAccountType.class).withNoArguments().thenReturn(bankAccountType);
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
	  Assert.assertNull(CreditBankAccount.run(null, null, null, 0.0));
  }
}
