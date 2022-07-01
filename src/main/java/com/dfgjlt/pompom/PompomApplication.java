package com.dfgjlt.pompom;

import com.eatthepath.pushy.apns.ApnsClient;
import com.eatthepath.pushy.apns.PushNotificationResponse;
import com.eatthepath.pushy.apns.util.ApnsPayloadBuilder;
import com.eatthepath.pushy.apns.util.SimpleApnsPayloadBuilder;
import com.eatthepath.pushy.apns.util.SimpleApnsPushNotification;
import com.eatthepath.pushy.apns.util.TokenUtil;
import com.eatthepath.pushy.apns.util.concurrent.PushNotificationFuture;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class PompomApplication {

	private final ApnsClient apnsClient;

	public PompomApplication(ApnsClient apnsClient) {
		this.apnsClient = apnsClient;
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "We are POMPOM.";
	}

	@RequestMapping("/apns-test")
	@ResponseBody
	String apnsTest() {
		/*
		final SimpleApnsPushNotification pushNotification;

		{
			final ApnsPayloadBuilder payloadBuilder = new SimpleApnsPayloadBuilder();
			payloadBuilder.setAlertBody("Example!");

			final String payload = payloadBuilder.build();
			final String token = TokenUtil.sanitizeTokenString("dc306f961a32bf42bc75f7a49201a9b56a6d1f195fc89ff08be7213e622ae566");

			pushNotification = new SimpleApnsPushNotification(token, "name.dev-timo.ApnsTest", payload);
		}

		final PushNotificationFuture<SimpleApnsPushNotification, PushNotificationResponse<SimpleApnsPushNotification>>
				sendNotificationFuture = apnsClient.sendNotification(pushNotification);

		try {
			final PushNotificationResponse<SimpleApnsPushNotification> pushNotificationResponse =
					sendNotificationFuture.get();

			if (pushNotificationResponse.isAccepted()) {
				System.out.println("Push notification accepted by APNs gateway.");
			} else {
				System.out.println("Notification rejected by the APNs gateway: " +
						pushNotificationResponse.getRejectionReason());

				pushNotificationResponse.getTokenInvalidationTimestamp().ifPresent(timestamp -> {
					System.out.println("\t…and the token is invalid as of " + timestamp);
				});
			}
		} catch (final Exception e) {
			System.err.println("Failed to send push notification.");
			e.printStackTrace();
		}
		 */

		return "Notification is sent.";
	}


	public static void main(String[] args) {
		SpringApplication.run(PompomApplication.class, args);
	}

}
