// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito
{
    /// <summary>
    /// Provides a Cognito User Pool resource.
    /// 
    /// ## Example Usage
    /// ### Basic configuration
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var pool = new Aws.Cognito.UserPool("pool", new Aws.Cognito.UserPoolArgs
    ///         {
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class UserPool : Pulumi.CustomResource
    {
        /// <summary>
        /// The configuration for AdminCreateUser requests.
        /// </summary>
        [Output("adminCreateUserConfig")]
        public Output<Outputs.UserPoolAdminCreateUserConfig> AdminCreateUserConfig { get; private set; } = null!;

        /// <summary>
        /// Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `username_attributes`.
        /// </summary>
        [Output("aliasAttributes")]
        public Output<ImmutableArray<string>> AliasAttributes { get; private set; } = null!;

        /// <summary>
        /// The ARN of the user pool.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The attributes to be auto-verified. Possible values: email, phone_number.
        /// </summary>
        [Output("autoVerifiedAttributes")]
        public Output<ImmutableArray<string>> AutoVerifiedAttributes { get; private set; } = null!;

        /// <summary>
        /// The date the user pool was created.
        /// </summary>
        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        /// <summary>
        /// The configuration for the user pool's device tracking.
        /// </summary>
        [Output("deviceConfiguration")]
        public Output<Outputs.UserPoolDeviceConfiguration?> DeviceConfiguration { get; private set; } = null!;

        /// <summary>
        /// The Email Configuration.
        /// </summary>
        [Output("emailConfiguration")]
        public Output<Outputs.UserPoolEmailConfiguration?> EmailConfiguration { get; private set; } = null!;

        /// <summary>
        /// A string representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
        /// </summary>
        [Output("emailVerificationMessage")]
        public Output<string> EmailVerificationMessage { get; private set; } = null!;

        /// <summary>
        /// A string representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
        /// </summary>
        [Output("emailVerificationSubject")]
        public Output<string> EmailVerificationSubject { get; private set; } = null!;

        /// <summary>
        /// The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// A container for the AWS Lambda triggers associated with the user pool.
        /// </summary>
        [Output("lambdaConfig")]
        public Output<Outputs.UserPoolLambdaConfig> LambdaConfig { get; private set; } = null!;

        /// <summary>
        /// The date the user pool was last modified.
        /// </summary>
        [Output("lastModifiedDate")]
        public Output<string> LastModifiedDate { get; private set; } = null!;

        /// <summary>
        /// Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values:
        /// </summary>
        [Output("mfaConfiguration")]
        public Output<string?> MfaConfiguration { get; private set; } = null!;

        /// <summary>
        /// The name of the attribute.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A container for information about the user pool password policy.
        /// </summary>
        [Output("passwordPolicy")]
        public Output<Outputs.UserPoolPasswordPolicy> PasswordPolicy { get; private set; } = null!;

        /// <summary>
        /// A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
        /// </summary>
        [Output("schemas")]
        public Output<ImmutableArray<Outputs.UserPoolSchema>> Schemas { get; private set; } = null!;

        /// <summary>
        /// A string representing the SMS authentication message. The message must contain the `{####}` placeholder, which will be replaced with the code.
        /// </summary>
        [Output("smsAuthenticationMessage")]
        public Output<string?> SmsAuthenticationMessage { get; private set; } = null!;

        /// <summary>
        /// Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the [`up` command and use --replace](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
        /// </summary>
        [Output("smsConfiguration")]
        public Output<Outputs.UserPoolSmsConfiguration> SmsConfiguration { get; private set; } = null!;

        /// <summary>
        /// A string representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
        /// </summary>
        [Output("smsVerificationMessage")]
        public Output<string> SmsVerificationMessage { get; private set; } = null!;

        /// <summary>
        /// Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
        /// </summary>
        [Output("softwareTokenMfaConfiguration")]
        public Output<Outputs.UserPoolSoftwareTokenMfaConfiguration?> SoftwareTokenMfaConfiguration { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the User Pool.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Configuration block for user pool add-ons to enable user pool advanced security mode features.
        /// </summary>
        [Output("userPoolAddOns")]
        public Output<Outputs.UserPoolUserPoolAddOns?> UserPoolAddOns { get; private set; } = null!;

        /// <summary>
        /// Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
        /// </summary>
        [Output("usernameAttributes")]
        public Output<ImmutableArray<string>> UsernameAttributes { get; private set; } = null!;

        /// <summary>
        /// The Username Configuration.
        /// </summary>
        [Output("usernameConfiguration")]
        public Output<Outputs.UserPoolUsernameConfiguration?> UsernameConfiguration { get; private set; } = null!;

        /// <summary>
        /// The verification message templates configuration.
        /// </summary>
        [Output("verificationMessageTemplate")]
        public Output<Outputs.UserPoolVerificationMessageTemplate> VerificationMessageTemplate { get; private set; } = null!;


        /// <summary>
        /// Create a UserPool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserPool(string name, UserPoolArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:cognito/userPool:UserPool", name, args ?? new UserPoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserPool(string name, Input<string> id, UserPoolState? state = null, CustomResourceOptions? options = null)
            : base("aws:cognito/userPool:UserPool", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UserPool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserPool Get(string name, Input<string> id, UserPoolState? state = null, CustomResourceOptions? options = null)
        {
            return new UserPool(name, id, state, options);
        }
    }

    public sealed class UserPoolArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration for AdminCreateUser requests.
        /// </summary>
        [Input("adminCreateUserConfig")]
        public Input<Inputs.UserPoolAdminCreateUserConfigArgs>? AdminCreateUserConfig { get; set; }

        [Input("aliasAttributes")]
        private InputList<string>? _aliasAttributes;

        /// <summary>
        /// Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `username_attributes`.
        /// </summary>
        public InputList<string> AliasAttributes
        {
            get => _aliasAttributes ?? (_aliasAttributes = new InputList<string>());
            set => _aliasAttributes = value;
        }

        [Input("autoVerifiedAttributes")]
        private InputList<string>? _autoVerifiedAttributes;

        /// <summary>
        /// The attributes to be auto-verified. Possible values: email, phone_number.
        /// </summary>
        public InputList<string> AutoVerifiedAttributes
        {
            get => _autoVerifiedAttributes ?? (_autoVerifiedAttributes = new InputList<string>());
            set => _autoVerifiedAttributes = value;
        }

        /// <summary>
        /// The configuration for the user pool's device tracking.
        /// </summary>
        [Input("deviceConfiguration")]
        public Input<Inputs.UserPoolDeviceConfigurationArgs>? DeviceConfiguration { get; set; }

        /// <summary>
        /// The Email Configuration.
        /// </summary>
        [Input("emailConfiguration")]
        public Input<Inputs.UserPoolEmailConfigurationArgs>? EmailConfiguration { get; set; }

        /// <summary>
        /// A string representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
        /// </summary>
        [Input("emailVerificationMessage")]
        public Input<string>? EmailVerificationMessage { get; set; }

        /// <summary>
        /// A string representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
        /// </summary>
        [Input("emailVerificationSubject")]
        public Input<string>? EmailVerificationSubject { get; set; }

        /// <summary>
        /// A container for the AWS Lambda triggers associated with the user pool.
        /// </summary>
        [Input("lambdaConfig")]
        public Input<Inputs.UserPoolLambdaConfigArgs>? LambdaConfig { get; set; }

        /// <summary>
        /// Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values:
        /// </summary>
        [Input("mfaConfiguration")]
        public Input<string>? MfaConfiguration { get; set; }

        /// <summary>
        /// The name of the attribute.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A container for information about the user pool password policy.
        /// </summary>
        [Input("passwordPolicy")]
        public Input<Inputs.UserPoolPasswordPolicyArgs>? PasswordPolicy { get; set; }

        [Input("schemas")]
        private InputList<Inputs.UserPoolSchemaArgs>? _schemas;

        /// <summary>
        /// A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
        /// </summary>
        public InputList<Inputs.UserPoolSchemaArgs> Schemas
        {
            get => _schemas ?? (_schemas = new InputList<Inputs.UserPoolSchemaArgs>());
            set => _schemas = value;
        }

        /// <summary>
        /// A string representing the SMS authentication message. The message must contain the `{####}` placeholder, which will be replaced with the code.
        /// </summary>
        [Input("smsAuthenticationMessage")]
        public Input<string>? SmsAuthenticationMessage { get; set; }

        /// <summary>
        /// Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the [`up` command and use --replace](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
        /// </summary>
        [Input("smsConfiguration")]
        public Input<Inputs.UserPoolSmsConfigurationArgs>? SmsConfiguration { get; set; }

        /// <summary>
        /// A string representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
        /// </summary>
        [Input("smsVerificationMessage")]
        public Input<string>? SmsVerificationMessage { get; set; }

        /// <summary>
        /// Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
        /// </summary>
        [Input("softwareTokenMfaConfiguration")]
        public Input<Inputs.UserPoolSoftwareTokenMfaConfigurationArgs>? SoftwareTokenMfaConfiguration { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the User Pool.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Configuration block for user pool add-ons to enable user pool advanced security mode features.
        /// </summary>
        [Input("userPoolAddOns")]
        public Input<Inputs.UserPoolUserPoolAddOnsArgs>? UserPoolAddOns { get; set; }

        [Input("usernameAttributes")]
        private InputList<string>? _usernameAttributes;

        /// <summary>
        /// Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
        /// </summary>
        public InputList<string> UsernameAttributes
        {
            get => _usernameAttributes ?? (_usernameAttributes = new InputList<string>());
            set => _usernameAttributes = value;
        }

        /// <summary>
        /// The Username Configuration.
        /// </summary>
        [Input("usernameConfiguration")]
        public Input<Inputs.UserPoolUsernameConfigurationArgs>? UsernameConfiguration { get; set; }

        /// <summary>
        /// The verification message templates configuration.
        /// </summary>
        [Input("verificationMessageTemplate")]
        public Input<Inputs.UserPoolVerificationMessageTemplateArgs>? VerificationMessageTemplate { get; set; }

        public UserPoolArgs()
        {
        }
    }

    public sealed class UserPoolState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The configuration for AdminCreateUser requests.
        /// </summary>
        [Input("adminCreateUserConfig")]
        public Input<Inputs.UserPoolAdminCreateUserConfigGetArgs>? AdminCreateUserConfig { get; set; }

        [Input("aliasAttributes")]
        private InputList<string>? _aliasAttributes;

        /// <summary>
        /// Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. Conflicts with `username_attributes`.
        /// </summary>
        public InputList<string> AliasAttributes
        {
            get => _aliasAttributes ?? (_aliasAttributes = new InputList<string>());
            set => _aliasAttributes = value;
        }

        /// <summary>
        /// The ARN of the user pool.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("autoVerifiedAttributes")]
        private InputList<string>? _autoVerifiedAttributes;

        /// <summary>
        /// The attributes to be auto-verified. Possible values: email, phone_number.
        /// </summary>
        public InputList<string> AutoVerifiedAttributes
        {
            get => _autoVerifiedAttributes ?? (_autoVerifiedAttributes = new InputList<string>());
            set => _autoVerifiedAttributes = value;
        }

        /// <summary>
        /// The date the user pool was created.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// The configuration for the user pool's device tracking.
        /// </summary>
        [Input("deviceConfiguration")]
        public Input<Inputs.UserPoolDeviceConfigurationGetArgs>? DeviceConfiguration { get; set; }

        /// <summary>
        /// The Email Configuration.
        /// </summary>
        [Input("emailConfiguration")]
        public Input<Inputs.UserPoolEmailConfigurationGetArgs>? EmailConfiguration { get; set; }

        /// <summary>
        /// A string representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
        /// </summary>
        [Input("emailVerificationMessage")]
        public Input<string>? EmailVerificationMessage { get; set; }

        /// <summary>
        /// A string representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
        /// </summary>
        [Input("emailVerificationSubject")]
        public Input<string>? EmailVerificationSubject { get; set; }

        /// <summary>
        /// The endpoint name of the user pool. Example format: cognito-idp.REGION.amazonaws.com/xxxx_yyyyy
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// A container for the AWS Lambda triggers associated with the user pool.
        /// </summary>
        [Input("lambdaConfig")]
        public Input<Inputs.UserPoolLambdaConfigGetArgs>? LambdaConfig { get; set; }

        /// <summary>
        /// The date the user pool was last modified.
        /// </summary>
        [Input("lastModifiedDate")]
        public Input<string>? LastModifiedDate { get; set; }

        /// <summary>
        /// Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values:
        /// </summary>
        [Input("mfaConfiguration")]
        public Input<string>? MfaConfiguration { get; set; }

        /// <summary>
        /// The name of the attribute.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A container for information about the user pool password policy.
        /// </summary>
        [Input("passwordPolicy")]
        public Input<Inputs.UserPoolPasswordPolicyGetArgs>? PasswordPolicy { get; set; }

        [Input("schemas")]
        private InputList<Inputs.UserPoolSchemaGetArgs>? _schemas;

        /// <summary>
        /// A container with the schema attributes of a user pool. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Maximum of 50 attributes.
        /// </summary>
        public InputList<Inputs.UserPoolSchemaGetArgs> Schemas
        {
            get => _schemas ?? (_schemas = new InputList<Inputs.UserPoolSchemaGetArgs>());
            set => _schemas = value;
        }

        /// <summary>
        /// A string representing the SMS authentication message. The message must contain the `{####}` placeholder, which will be replaced with the code.
        /// </summary>
        [Input("smsAuthenticationMessage")]
        public Input<string>? SmsAuthenticationMessage { get; set; }

        /// <summary>
        /// Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection. To force resource recreation after this configuration has been applied, see the [`up` command and use --replace](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
        /// </summary>
        [Input("smsConfiguration")]
        public Input<Inputs.UserPoolSmsConfigurationGetArgs>? SmsConfiguration { get; set; }

        /// <summary>
        /// A string representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
        /// </summary>
        [Input("smsVerificationMessage")]
        public Input<string>? SmsVerificationMessage { get; set; }

        /// <summary>
        /// Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
        /// </summary>
        [Input("softwareTokenMfaConfiguration")]
        public Input<Inputs.UserPoolSoftwareTokenMfaConfigurationGetArgs>? SoftwareTokenMfaConfiguration { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the User Pool.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Configuration block for user pool add-ons to enable user pool advanced security mode features.
        /// </summary>
        [Input("userPoolAddOns")]
        public Input<Inputs.UserPoolUserPoolAddOnsGetArgs>? UserPoolAddOns { get; set; }

        [Input("usernameAttributes")]
        private InputList<string>? _usernameAttributes;

        /// <summary>
        /// Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
        /// </summary>
        public InputList<string> UsernameAttributes
        {
            get => _usernameAttributes ?? (_usernameAttributes = new InputList<string>());
            set => _usernameAttributes = value;
        }

        /// <summary>
        /// The Username Configuration.
        /// </summary>
        [Input("usernameConfiguration")]
        public Input<Inputs.UserPoolUsernameConfigurationGetArgs>? UsernameConfiguration { get; set; }

        /// <summary>
        /// The verification message templates configuration.
        /// </summary>
        [Input("verificationMessageTemplate")]
        public Input<Inputs.UserPoolVerificationMessageTemplateGetArgs>? VerificationMessageTemplate { get; set; }

        public UserPoolState()
        {
        }
    }
}
