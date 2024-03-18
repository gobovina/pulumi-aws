// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomEmailSenderArgs;
import com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomSmsSenderArgs;
import com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigPreTokenGenerationConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolLambdaConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolLambdaConfigArgs Empty = new UserPoolLambdaConfigArgs();

    /**
     * ARN of the lambda creating an authentication challenge.
     * 
     */
    @Import(name="createAuthChallenge")
    private @Nullable Output<String> createAuthChallenge;

    /**
     * @return ARN of the lambda creating an authentication challenge.
     * 
     */
    public Optional<Output<String>> createAuthChallenge() {
        return Optional.ofNullable(this.createAuthChallenge);
    }

    /**
     * A custom email sender AWS Lambda trigger. See custom_email_sender Below.
     * 
     */
    @Import(name="customEmailSender")
    private @Nullable Output<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender;

    /**
     * @return A custom email sender AWS Lambda trigger. See custom_email_sender Below.
     * 
     */
    public Optional<Output<UserPoolLambdaConfigCustomEmailSenderArgs>> customEmailSender() {
        return Optional.ofNullable(this.customEmailSender);
    }

    /**
     * Custom Message AWS Lambda trigger.
     * 
     */
    @Import(name="customMessage")
    private @Nullable Output<String> customMessage;

    /**
     * @return Custom Message AWS Lambda trigger.
     * 
     */
    public Optional<Output<String>> customMessage() {
        return Optional.ofNullable(this.customMessage);
    }

    /**
     * A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
     * 
     */
    @Import(name="customSmsSender")
    private @Nullable Output<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender;

    /**
     * @return A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
     * 
     */
    public Optional<Output<UserPoolLambdaConfigCustomSmsSenderArgs>> customSmsSender() {
        return Optional.ofNullable(this.customSmsSender);
    }

    /**
     * Defines the authentication challenge.
     * 
     */
    @Import(name="defineAuthChallenge")
    private @Nullable Output<String> defineAuthChallenge;

    /**
     * @return Defines the authentication challenge.
     * 
     */
    public Optional<Output<String>> defineAuthChallenge() {
        return Optional.ofNullable(this.defineAuthChallenge);
    }

    /**
     * The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Post-authentication AWS Lambda trigger.
     * 
     */
    @Import(name="postAuthentication")
    private @Nullable Output<String> postAuthentication;

    /**
     * @return Post-authentication AWS Lambda trigger.
     * 
     */
    public Optional<Output<String>> postAuthentication() {
        return Optional.ofNullable(this.postAuthentication);
    }

    /**
     * Post-confirmation AWS Lambda trigger.
     * 
     */
    @Import(name="postConfirmation")
    private @Nullable Output<String> postConfirmation;

    /**
     * @return Post-confirmation AWS Lambda trigger.
     * 
     */
    public Optional<Output<String>> postConfirmation() {
        return Optional.ofNullable(this.postConfirmation);
    }

    /**
     * Pre-authentication AWS Lambda trigger.
     * 
     */
    @Import(name="preAuthentication")
    private @Nullable Output<String> preAuthentication;

    /**
     * @return Pre-authentication AWS Lambda trigger.
     * 
     */
    public Optional<Output<String>> preAuthentication() {
        return Optional.ofNullable(this.preAuthentication);
    }

    /**
     * Pre-registration AWS Lambda trigger.
     * 
     */
    @Import(name="preSignUp")
    private @Nullable Output<String> preSignUp;

    /**
     * @return Pre-registration AWS Lambda trigger.
     * 
     */
    public Optional<Output<String>> preSignUp() {
        return Optional.ofNullable(this.preSignUp);
    }

    /**
     * Allow to customize identity token claims before token generation. Set this parameter for legacy purposes; for new instances of pre token generation triggers, set the LambdaArn of `pre_token_generation_config`.
     * 
     */
    @Import(name="preTokenGeneration")
    private @Nullable Output<String> preTokenGeneration;

    /**
     * @return Allow to customize identity token claims before token generation. Set this parameter for legacy purposes; for new instances of pre token generation triggers, set the LambdaArn of `pre_token_generation_config`.
     * 
     */
    public Optional<Output<String>> preTokenGeneration() {
        return Optional.ofNullable(this.preTokenGeneration);
    }

    /**
     * Allow to customize access tokens. See pre_token_configuration_type
     * 
     */
    @Import(name="preTokenGenerationConfig")
    private @Nullable Output<UserPoolLambdaConfigPreTokenGenerationConfigArgs> preTokenGenerationConfig;

    /**
     * @return Allow to customize access tokens. See pre_token_configuration_type
     * 
     */
    public Optional<Output<UserPoolLambdaConfigPreTokenGenerationConfigArgs>> preTokenGenerationConfig() {
        return Optional.ofNullable(this.preTokenGenerationConfig);
    }

    /**
     * User migration Lambda config type.
     * 
     */
    @Import(name="userMigration")
    private @Nullable Output<String> userMigration;

    /**
     * @return User migration Lambda config type.
     * 
     */
    public Optional<Output<String>> userMigration() {
        return Optional.ofNullable(this.userMigration);
    }

    /**
     * Verifies the authentication challenge response.
     * 
     */
    @Import(name="verifyAuthChallengeResponse")
    private @Nullable Output<String> verifyAuthChallengeResponse;

    /**
     * @return Verifies the authentication challenge response.
     * 
     */
    public Optional<Output<String>> verifyAuthChallengeResponse() {
        return Optional.ofNullable(this.verifyAuthChallengeResponse);
    }

    private UserPoolLambdaConfigArgs() {}

    private UserPoolLambdaConfigArgs(UserPoolLambdaConfigArgs $) {
        this.createAuthChallenge = $.createAuthChallenge;
        this.customEmailSender = $.customEmailSender;
        this.customMessage = $.customMessage;
        this.customSmsSender = $.customSmsSender;
        this.defineAuthChallenge = $.defineAuthChallenge;
        this.kmsKeyId = $.kmsKeyId;
        this.postAuthentication = $.postAuthentication;
        this.postConfirmation = $.postConfirmation;
        this.preAuthentication = $.preAuthentication;
        this.preSignUp = $.preSignUp;
        this.preTokenGeneration = $.preTokenGeneration;
        this.preTokenGenerationConfig = $.preTokenGenerationConfig;
        this.userMigration = $.userMigration;
        this.verifyAuthChallengeResponse = $.verifyAuthChallengeResponse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolLambdaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolLambdaConfigArgs $;

        public Builder() {
            $ = new UserPoolLambdaConfigArgs();
        }

        public Builder(UserPoolLambdaConfigArgs defaults) {
            $ = new UserPoolLambdaConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param createAuthChallenge ARN of the lambda creating an authentication challenge.
         * 
         * @return builder
         * 
         */
        public Builder createAuthChallenge(@Nullable Output<String> createAuthChallenge) {
            $.createAuthChallenge = createAuthChallenge;
            return this;
        }

        /**
         * @param createAuthChallenge ARN of the lambda creating an authentication challenge.
         * 
         * @return builder
         * 
         */
        public Builder createAuthChallenge(String createAuthChallenge) {
            return createAuthChallenge(Output.of(createAuthChallenge));
        }

        /**
         * @param customEmailSender A custom email sender AWS Lambda trigger. See custom_email_sender Below.
         * 
         * @return builder
         * 
         */
        public Builder customEmailSender(@Nullable Output<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender) {
            $.customEmailSender = customEmailSender;
            return this;
        }

        /**
         * @param customEmailSender A custom email sender AWS Lambda trigger. See custom_email_sender Below.
         * 
         * @return builder
         * 
         */
        public Builder customEmailSender(UserPoolLambdaConfigCustomEmailSenderArgs customEmailSender) {
            return customEmailSender(Output.of(customEmailSender));
        }

        /**
         * @param customMessage Custom Message AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder customMessage(@Nullable Output<String> customMessage) {
            $.customMessage = customMessage;
            return this;
        }

        /**
         * @param customMessage Custom Message AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder customMessage(String customMessage) {
            return customMessage(Output.of(customMessage));
        }

        /**
         * @param customSmsSender A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
         * 
         * @return builder
         * 
         */
        public Builder customSmsSender(@Nullable Output<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender) {
            $.customSmsSender = customSmsSender;
            return this;
        }

        /**
         * @param customSmsSender A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
         * 
         * @return builder
         * 
         */
        public Builder customSmsSender(UserPoolLambdaConfigCustomSmsSenderArgs customSmsSender) {
            return customSmsSender(Output.of(customSmsSender));
        }

        /**
         * @param defineAuthChallenge Defines the authentication challenge.
         * 
         * @return builder
         * 
         */
        public Builder defineAuthChallenge(@Nullable Output<String> defineAuthChallenge) {
            $.defineAuthChallenge = defineAuthChallenge;
            return this;
        }

        /**
         * @param defineAuthChallenge Defines the authentication challenge.
         * 
         * @return builder
         * 
         */
        public Builder defineAuthChallenge(String defineAuthChallenge) {
            return defineAuthChallenge(Output.of(defineAuthChallenge));
        }

        /**
         * @param kmsKeyId The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param postAuthentication Post-authentication AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder postAuthentication(@Nullable Output<String> postAuthentication) {
            $.postAuthentication = postAuthentication;
            return this;
        }

        /**
         * @param postAuthentication Post-authentication AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder postAuthentication(String postAuthentication) {
            return postAuthentication(Output.of(postAuthentication));
        }

        /**
         * @param postConfirmation Post-confirmation AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder postConfirmation(@Nullable Output<String> postConfirmation) {
            $.postConfirmation = postConfirmation;
            return this;
        }

        /**
         * @param postConfirmation Post-confirmation AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder postConfirmation(String postConfirmation) {
            return postConfirmation(Output.of(postConfirmation));
        }

        /**
         * @param preAuthentication Pre-authentication AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder preAuthentication(@Nullable Output<String> preAuthentication) {
            $.preAuthentication = preAuthentication;
            return this;
        }

        /**
         * @param preAuthentication Pre-authentication AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder preAuthentication(String preAuthentication) {
            return preAuthentication(Output.of(preAuthentication));
        }

        /**
         * @param preSignUp Pre-registration AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder preSignUp(@Nullable Output<String> preSignUp) {
            $.preSignUp = preSignUp;
            return this;
        }

        /**
         * @param preSignUp Pre-registration AWS Lambda trigger.
         * 
         * @return builder
         * 
         */
        public Builder preSignUp(String preSignUp) {
            return preSignUp(Output.of(preSignUp));
        }

        /**
         * @param preTokenGeneration Allow to customize identity token claims before token generation. Set this parameter for legacy purposes; for new instances of pre token generation triggers, set the LambdaArn of `pre_token_generation_config`.
         * 
         * @return builder
         * 
         */
        public Builder preTokenGeneration(@Nullable Output<String> preTokenGeneration) {
            $.preTokenGeneration = preTokenGeneration;
            return this;
        }

        /**
         * @param preTokenGeneration Allow to customize identity token claims before token generation. Set this parameter for legacy purposes; for new instances of pre token generation triggers, set the LambdaArn of `pre_token_generation_config`.
         * 
         * @return builder
         * 
         */
        public Builder preTokenGeneration(String preTokenGeneration) {
            return preTokenGeneration(Output.of(preTokenGeneration));
        }

        /**
         * @param preTokenGenerationConfig Allow to customize access tokens. See pre_token_configuration_type
         * 
         * @return builder
         * 
         */
        public Builder preTokenGenerationConfig(@Nullable Output<UserPoolLambdaConfigPreTokenGenerationConfigArgs> preTokenGenerationConfig) {
            $.preTokenGenerationConfig = preTokenGenerationConfig;
            return this;
        }

        /**
         * @param preTokenGenerationConfig Allow to customize access tokens. See pre_token_configuration_type
         * 
         * @return builder
         * 
         */
        public Builder preTokenGenerationConfig(UserPoolLambdaConfigPreTokenGenerationConfigArgs preTokenGenerationConfig) {
            return preTokenGenerationConfig(Output.of(preTokenGenerationConfig));
        }

        /**
         * @param userMigration User migration Lambda config type.
         * 
         * @return builder
         * 
         */
        public Builder userMigration(@Nullable Output<String> userMigration) {
            $.userMigration = userMigration;
            return this;
        }

        /**
         * @param userMigration User migration Lambda config type.
         * 
         * @return builder
         * 
         */
        public Builder userMigration(String userMigration) {
            return userMigration(Output.of(userMigration));
        }

        /**
         * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
         * 
         * @return builder
         * 
         */
        public Builder verifyAuthChallengeResponse(@Nullable Output<String> verifyAuthChallengeResponse) {
            $.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
            return this;
        }

        /**
         * @param verifyAuthChallengeResponse Verifies the authentication challenge response.
         * 
         * @return builder
         * 
         */
        public Builder verifyAuthChallengeResponse(String verifyAuthChallengeResponse) {
            return verifyAuthChallengeResponse(Output.of(verifyAuthChallengeResponse));
        }

        public UserPoolLambdaConfigArgs build() {
            return $;
        }
    }

}
