package net.authorize.sample.RecurringBilling;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import net.authorize.api.contract.v1.ANetApiResponse;
import net.authorize.api.contract.v1.ARBGetSubscriptionRequest;
import net.authorize.api.contract.v1.ARBGetSubscriptionResponse;
import net.authorize.api.contract.v1.MerchantAuthenticationType;
import net.authorize.api.contract.v1.MessagesType;
import net.authorize.api.controller.ARBGetSubscriptionController;
import net.authorize.api.controller.base.ApiOperationBase;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Method;
import java.util.ArrayList;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class GetSubscriptionTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Test
  public void constructorOutputVoid() {
  	final GetSubscription getSubscription = new GetSubscription();
  }

  @PrepareForTest({MessagesType.class, ARBGetSubscriptionController.class, ANetApiResponse.class,
                   ARBGetSubscriptionRequest.class, System.class, GetSubscription.class,
                   MerchantAuthenticationType.class, ApiOperationBase.class})
  @Test
  public void
  runInputNullNullNullOutputClassCastException() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final ARBGetSubscriptionResponse aRBGetSubscriptionResponse =
        PowerMockito.mock(ARBGetSubscriptionResponse.class);
    PowerMockito.whenNew(ARBGetSubscriptionResponse.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionResponse);
    final ARBGetSubscriptionController aRBGetSubscriptionController =
        PowerMockito.mock(ARBGetSubscriptionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(aRBGetSubscriptionController, getApiResponseMethod)
        .withNoArguments();
    final ANetApiResponse aNetApiResponse = PowerMockito.mock(ANetApiResponse.class);
    final MessagesType messagesType1 = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(0);
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
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getErrorResponse");
    PowerMockito.doReturn(aNetApiResponse)
        .when(aRBGetSubscriptionController, getErrorResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(ARBGetSubscriptionController.class)
        .withParameterTypes(ARBGetSubscriptionRequest.class)
        .withArguments(
            or(isA(ARBGetSubscriptionRequest.class), isNull(ARBGetSubscriptionRequest.class)))
        .thenReturn(aRBGetSubscriptionController);
    final ARBGetSubscriptionRequest aRBGetSubscriptionRequest =
        PowerMockito.mock(ARBGetSubscriptionRequest.class);
    PowerMockito.whenNew(ARBGetSubscriptionRequest.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionRequest);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    thrown.expect(ClassCastException.class);
    GetSubscription.run(null, null, null);
  }

  @PrepareForTest({MessagesType.class, ARBGetSubscriptionController.class, ANetApiResponse.class,
                   ARBGetSubscriptionRequest.class, System.class, GetSubscription.class,
                   MerchantAuthenticationType.class, ApiOperationBase.class})
  @Test
  public void
  runInputNullNullNullOutputIndexOutOfBoundsException() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final ARBGetSubscriptionResponse aRBGetSubscriptionResponse =
        PowerMockito.mock(ARBGetSubscriptionResponse.class);
    PowerMockito.whenNew(ARBGetSubscriptionResponse.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionResponse);
    final ARBGetSubscriptionController aRBGetSubscriptionController =
        PowerMockito.mock(ARBGetSubscriptionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(aRBGetSubscriptionController, getApiResponseMethod)
        .withNoArguments();
    final ANetApiResponse aNetApiResponse = PowerMockito.mock(ANetApiResponse.class);
    final MessagesType messagesType1 = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList1 = new ArrayList();
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
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getErrorResponse");
    PowerMockito.doReturn(aNetApiResponse)
        .when(aRBGetSubscriptionController, getErrorResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(ARBGetSubscriptionController.class)
        .withParameterTypes(ARBGetSubscriptionRequest.class)
        .withArguments(
            or(isA(ARBGetSubscriptionRequest.class), isNull(ARBGetSubscriptionRequest.class)))
        .thenReturn(aRBGetSubscriptionController);
    final ARBGetSubscriptionRequest aRBGetSubscriptionRequest =
        PowerMockito.mock(ARBGetSubscriptionRequest.class);
    PowerMockito.whenNew(ARBGetSubscriptionRequest.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionRequest);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    thrown.expect(IndexOutOfBoundsException.class);
    GetSubscription.run(null, null, null);
  }

  @PrepareForTest({MessagesType.class, ARBGetSubscriptionController.class, ANetApiResponse.class,
                   ARBGetSubscriptionRequest.class, System.class, GetSubscription.class,
                   MerchantAuthenticationType.class, ApiOperationBase.class})
  @Test
  public void
  runInputNullNullNullOutputNull() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final ARBGetSubscriptionResponse aRBGetSubscriptionResponse =
        PowerMockito.mock(ARBGetSubscriptionResponse.class);
    PowerMockito.whenNew(ARBGetSubscriptionResponse.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionResponse);
    final ARBGetSubscriptionController aRBGetSubscriptionController =
        PowerMockito.mock(ARBGetSubscriptionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(aRBGetSubscriptionController, getApiResponseMethod)
        .withNoArguments();
    final ANetApiResponse aNetApiResponse = PowerMockito.mock(ANetApiResponse.class);
    final MessagesType messagesType = PowerMockito.mock(MessagesType.class);
    final ArrayList arrayList = new ArrayList();
    final Method getMessageMethod = DTUMemberMatcher.method(MessagesType.class, "getMessage");
    PowerMockito.doReturn(arrayList).when(messagesType, getMessageMethod).withNoArguments();
    final Method getMessagesMethod = DTUMemberMatcher.method(ANetApiResponse.class, "getMessages");
    PowerMockito.doReturn(messagesType).when(aNetApiResponse, getMessagesMethod).withNoArguments();
    final Method getErrorResponseMethod =
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getErrorResponse");
    PowerMockito.doReturn(aNetApiResponse)
        .when(aRBGetSubscriptionController, getErrorResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(ARBGetSubscriptionController.class)
        .withParameterTypes(ARBGetSubscriptionRequest.class)
        .withArguments(
            or(isA(ARBGetSubscriptionRequest.class), isNull(ARBGetSubscriptionRequest.class)))
        .thenReturn(aRBGetSubscriptionController);
    final ARBGetSubscriptionRequest aRBGetSubscriptionRequest =
        PowerMockito.mock(ARBGetSubscriptionRequest.class);
    PowerMockito.whenNew(ARBGetSubscriptionRequest.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionRequest);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
	  Assert.assertNull(GetSubscription.run(null, null, null));
  }

  @PrepareForTest({MessagesType.class, ARBGetSubscriptionController.class, ANetApiResponse.class,
                   ARBGetSubscriptionRequest.class, System.class, GetSubscription.class,
                   MerchantAuthenticationType.class, ApiOperationBase.class})
  @Test
  public void
  runInputNullNullNullOutputNullPointerException() throws Exception {
  	PowerMockito.mockStatic(ApiOperationBase.class);
	  final ARBGetSubscriptionResponse aRBGetSubscriptionResponse =
        PowerMockito.mock(ARBGetSubscriptionResponse.class);
    PowerMockito.whenNew(ARBGetSubscriptionResponse.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionResponse);
    final ARBGetSubscriptionController aRBGetSubscriptionController =
        PowerMockito.mock(ARBGetSubscriptionController.class);
    final Method getApiResponseMethod =
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getApiResponse");
    PowerMockito.doReturn(null)
        .when(aRBGetSubscriptionController, getApiResponseMethod)
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
        DTUMemberMatcher.method(ARBGetSubscriptionController.class, "getErrorResponse");
    PowerMockito.doReturn(aNetApiResponse)
        .when(aRBGetSubscriptionController, getErrorResponseMethod)
        .withNoArguments();
    PowerMockito.whenNew(ARBGetSubscriptionController.class)
        .withParameterTypes(ARBGetSubscriptionRequest.class)
        .withArguments(
            or(isA(ARBGetSubscriptionRequest.class), isNull(ARBGetSubscriptionRequest.class)))
        .thenReturn(aRBGetSubscriptionController);
    final ARBGetSubscriptionRequest aRBGetSubscriptionRequest =
        PowerMockito.mock(ARBGetSubscriptionRequest.class);
    PowerMockito.whenNew(ARBGetSubscriptionRequest.class)
        .withNoArguments()
        .thenReturn(aRBGetSubscriptionRequest);
    final MerchantAuthenticationType merchantAuthenticationType =
        PowerMockito.mock(MerchantAuthenticationType.class);
    PowerMockito.whenNew(MerchantAuthenticationType.class)
        .withNoArguments()
        .thenReturn(merchantAuthenticationType);
    thrown.expect(NullPointerException.class);
    GetSubscription.run(null, null, null);
  }
}
