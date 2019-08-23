package net.authorize.sample.RecurringBilling;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import net.authorize.api.contract.v1.ARBCreateSubscriptionRequest;
import net.authorize.api.contract.v1.ARBSubscriptionType;
import net.authorize.api.contract.v1.CreditCardType;
import net.authorize.api.contract.v1.MerchantAuthenticationType;
import net.authorize.api.contract.v1.NameAndAddressType;
import net.authorize.api.contract.v1.PaymentScheduleType;
import net.authorize.api.contract.v1.PaymentType;
import net.authorize.api.controller.ARBCreateSubscriptionController;
import net.authorize.api.controller.base.ApiOperationBase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.xml.datatype.DatatypeFactory;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class CreateSubscriptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorOutputVoid() {
    final CreateSubscription createSubscription = new CreateSubscription();
  }

  @PrepareForTest(
      fullyQualifiedNames = {"net.authorize.api.contract.v1.PaymentScheduleType$Interval"},
      value = {ARBCreateSubscriptionRequest.class, PaymentScheduleType.class,
               ARBCreateSubscriptionController.class, CreateSubscription.class,
               ApiOperationBase.class, MerchantAuthenticationType.class, BigDecimal.class,
               DatatypeFactory.class, CreditCardType.class, ARBSubscriptionType.class,
               PaymentType.class, NameAndAddressType.class})
  @Test
  public void
  runInputNullNullZeroZeroOutputNull() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
    PowerMockito.mockStatic(DatatypeFactory.class);
	  final ARBCreateSubscriptionController aRBCreateSubscriptionController =
        PowerMockito.mock(ARBCreateSubscriptionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(ARBCreateSubscriptionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(aRBCreateSubscriptionController, getApiResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(ARBCreateSubscriptionController.class)
        .withParameterTypes(ARBCreateSubscriptionRequest.class)
        .withArguments(
            or(isA(ARBCreateSubscriptionRequest.class), isNull(ARBCreateSubscriptionRequest.class)))
        .thenReturn(aRBCreateSubscriptionController);
    final NameAndAddressType nameAndAddressType = PowerMockito.mock(NameAndAddressType.class);
    PowerMockito.whenNew(NameAndAddressType.class).withNoArguments().thenReturn(nameAndAddressType);
    final BigDecimal bigDecimal1 = PowerMockito.mock(BigDecimal.class);
    final Method setScaleMethod1 =
        DTUMemberMatcher.method(BigDecimal.class, "setScale", int.class, RoundingMode.class);
    PowerMockito.doReturn(null)
        .when(bigDecimal1, setScaleMethod1)
        .withArguments(anyInt(), or(isA(RoundingMode.class), isNull(RoundingMode.class)));
    final BigDecimal bigDecimal = PowerMockito.mock(BigDecimal.class);
    final Method setScaleMethod =
        DTUMemberMatcher.method(BigDecimal.class, "setScale", int.class, RoundingMode.class);
    PowerMockito.doReturn(null)
        .when(bigDecimal, setScaleMethod)
        .withArguments(anyInt(), or(isA(RoundingMode.class), isNull(RoundingMode.class)));
    PowerMockito.whenNew(BigDecimal.class)
        .withParameterTypes(double.class)
        .withArguments(anyDouble())
        .thenReturn(bigDecimal)
        .thenReturn(bigDecimal1);
    final CreditCardType creditCardType = PowerMockito.mock(CreditCardType.class);
    PowerMockito.whenNew(CreditCardType.class).withNoArguments().thenReturn(creditCardType);
    final ARBSubscriptionType aRBSubscriptionType = PowerMockito.mock(ARBSubscriptionType.class);
    PowerMockito.whenNew(ARBSubscriptionType.class)
        .withNoArguments()
        .thenReturn(aRBSubscriptionType);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    final PaymentScheduleType paymentScheduleType = PowerMockito.mock(PaymentScheduleType.class);
    PowerMockito.whenNew(PaymentScheduleType.class)
        .withNoArguments()
        .thenReturn(paymentScheduleType);
    final ARBCreateSubscriptionRequest aRBCreateSubscriptionRequest =
        PowerMockito.mock(ARBCreateSubscriptionRequest.class);
    PowerMockito.whenNew(ARBCreateSubscriptionRequest.class)
        .withNoArguments()
        .thenReturn(aRBCreateSubscriptionRequest);
    final PaymentType paymentType = PowerMockito.mock(PaymentType.class);
    PowerMockito.whenNew(PaymentType.class).withNoArguments().thenReturn(paymentType);
    final PaymentScheduleType.Interval interval =
        PowerMockito.mock(PaymentScheduleType.Interval.class);
    PowerMockito.whenNew(PaymentScheduleType.Interval.class).withNoArguments().thenReturn(interval);
    PowerMockito.doReturn(null).when(DatatypeFactory.class);
    DatatypeFactory.newInstance();
	  Assert.assertNull(CreateSubscription.run(null, null, (short)0, 0.0));
  }
}
