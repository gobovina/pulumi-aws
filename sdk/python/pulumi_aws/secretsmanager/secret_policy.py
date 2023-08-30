# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SecretPolicyArgs', 'SecretPolicy']

@pulumi.input_type
class SecretPolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 secret_arn: pulumi.Input[str],
                 block_public_policy: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SecretPolicy resource.
        :param pulumi.Input[str] policy: Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `secretsmanager.Secret`, where `policy` can be set to `"{}"` to delete the policy, `"{}"` is not a valid policy since `policy` is required.
        :param pulumi.Input[str] secret_arn: Secret ARN.
               
               The following arguments are optional:
        :param pulumi.Input[bool] block_public_policy: Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "secret_arn", secret_arn)
        if block_public_policy is not None:
            pulumi.set(__self__, "block_public_policy", block_public_policy)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `secretsmanager.Secret`, where `policy` can be set to `"{}"` to delete the policy, `"{}"` is not a valid policy since `policy` is required.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="secretArn")
    def secret_arn(self) -> pulumi.Input[str]:
        """
        Secret ARN.

        The following arguments are optional:
        """
        return pulumi.get(self, "secret_arn")

    @secret_arn.setter
    def secret_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_arn", value)

    @property
    @pulumi.getter(name="blockPublicPolicy")
    def block_public_policy(self) -> Optional[pulumi.Input[bool]]:
        """
        Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
        """
        return pulumi.get(self, "block_public_policy")

    @block_public_policy.setter
    def block_public_policy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "block_public_policy", value)


@pulumi.input_type
class _SecretPolicyState:
    def __init__(__self__, *,
                 block_public_policy: Optional[pulumi.Input[bool]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 secret_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SecretPolicy resources.
        :param pulumi.Input[bool] block_public_policy: Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
        :param pulumi.Input[str] policy: Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `secretsmanager.Secret`, where `policy` can be set to `"{}"` to delete the policy, `"{}"` is not a valid policy since `policy` is required.
        :param pulumi.Input[str] secret_arn: Secret ARN.
               
               The following arguments are optional:
        """
        if block_public_policy is not None:
            pulumi.set(__self__, "block_public_policy", block_public_policy)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if secret_arn is not None:
            pulumi.set(__self__, "secret_arn", secret_arn)

    @property
    @pulumi.getter(name="blockPublicPolicy")
    def block_public_policy(self) -> Optional[pulumi.Input[bool]]:
        """
        Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
        """
        return pulumi.get(self, "block_public_policy")

    @block_public_policy.setter
    def block_public_policy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "block_public_policy", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `secretsmanager.Secret`, where `policy` can be set to `"{}"` to delete the policy, `"{}"` is not a valid policy since `policy` is required.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="secretArn")
    def secret_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Secret ARN.

        The following arguments are optional:
        """
        return pulumi.get(self, "secret_arn")

    @secret_arn.setter
    def secret_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_arn", value)


class SecretPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 block_public_policy: Optional[pulumi.Input[bool]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 secret_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage AWS Secrets Manager secret policy.

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example_secret = aws.secretsmanager.Secret("exampleSecret")
        example_policy_document = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="EnableAnotherAWSAccountToReadTheSecret",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=["arn:aws:iam::123456789012:root"],
            )],
            actions=["secretsmanager:GetSecretValue"],
            resources=["*"],
        )])
        example_secret_policy = aws.secretsmanager.SecretPolicy("exampleSecretPolicy",
            secret_arn=example_secret.arn,
            policy=example_policy_document.json)
        ```

        ## Import

        Using `pulumi import`, import `aws_secretsmanager_secret_policy` using the secret Amazon Resource Name (ARN). For example:

        ```sh
         $ pulumi import aws:secretsmanager/secretPolicy:SecretPolicy example arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] block_public_policy: Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
        :param pulumi.Input[str] policy: Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `secretsmanager.Secret`, where `policy` can be set to `"{}"` to delete the policy, `"{}"` is not a valid policy since `policy` is required.
        :param pulumi.Input[str] secret_arn: Secret ARN.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage AWS Secrets Manager secret policy.

        ## Example Usage
        ### Basic

        ```python
        import pulumi
        import pulumi_aws as aws

        example_secret = aws.secretsmanager.Secret("exampleSecret")
        example_policy_document = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="EnableAnotherAWSAccountToReadTheSecret",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=["arn:aws:iam::123456789012:root"],
            )],
            actions=["secretsmanager:GetSecretValue"],
            resources=["*"],
        )])
        example_secret_policy = aws.secretsmanager.SecretPolicy("exampleSecretPolicy",
            secret_arn=example_secret.arn,
            policy=example_policy_document.json)
        ```

        ## Import

        Using `pulumi import`, import `aws_secretsmanager_secret_policy` using the secret Amazon Resource Name (ARN). For example:

        ```sh
         $ pulumi import aws:secretsmanager/secretPolicy:SecretPolicy example arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456
        ```

        :param str resource_name: The name of the resource.
        :param SecretPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 block_public_policy: Optional[pulumi.Input[bool]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 secret_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretPolicyArgs.__new__(SecretPolicyArgs)

            __props__.__dict__["block_public_policy"] = block_public_policy
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if secret_arn is None and not opts.urn:
                raise TypeError("Missing required property 'secret_arn'")
            __props__.__dict__["secret_arn"] = secret_arn
        super(SecretPolicy, __self__).__init__(
            'aws:secretsmanager/secretPolicy:SecretPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            block_public_policy: Optional[pulumi.Input[bool]] = None,
            policy: Optional[pulumi.Input[str]] = None,
            secret_arn: Optional[pulumi.Input[str]] = None) -> 'SecretPolicy':
        """
        Get an existing SecretPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] block_public_policy: Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
        :param pulumi.Input[str] policy: Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `secretsmanager.Secret`, where `policy` can be set to `"{}"` to delete the policy, `"{}"` is not a valid policy since `policy` is required.
        :param pulumi.Input[str] secret_arn: Secret ARN.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretPolicyState.__new__(_SecretPolicyState)

        __props__.__dict__["block_public_policy"] = block_public_policy
        __props__.__dict__["policy"] = policy
        __props__.__dict__["secret_arn"] = secret_arn
        return SecretPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="blockPublicPolicy")
    def block_public_policy(self) -> pulumi.Output[Optional[bool]]:
        """
        Makes an optional API call to Zelkova to validate the Resource Policy to prevent broad access to your secret.
        """
        return pulumi.get(self, "block_public_policy")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        Valid JSON document representing a [resource policy](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html). Unlike `secretsmanager.Secret`, where `policy` can be set to `"{}"` to delete the policy, `"{}"` is not a valid policy since `policy` is required.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="secretArn")
    def secret_arn(self) -> pulumi.Output[str]:
        """
        Secret ARN.

        The following arguments are optional:
        """
        return pulumi.get(self, "secret_arn")

