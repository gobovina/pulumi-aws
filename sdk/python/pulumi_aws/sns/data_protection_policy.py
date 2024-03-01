# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DataProtectionPolicyArgs', 'DataProtectionPolicy']

@pulumi.input_type
class DataProtectionPolicyArgs:
    def __init__(__self__, *,
                 arn: pulumi.Input[str],
                 policy: pulumi.Input[str]):
        """
        The set of arguments for constructing a DataProtectionPolicy resource.
        :param pulumi.Input[str] arn: The ARN of the SNS topic
        :param pulumi.Input[str] policy: The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
        """
        pulumi.set(__self__, "arn", arn)
        pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Input[str]:
        """
        The ARN of the SNS topic
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)


@pulumi.input_type
class _DataProtectionPolicyState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DataProtectionPolicy resources.
        :param pulumi.Input[str] arn: The ARN of the SNS topic
        :param pulumi.Input[str] policy: The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the SNS topic
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)


class DataProtectionPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an SNS data protection topic policy resource

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.sns.Topic("example", name="example")
        example_data_protection_policy = aws.sns.DataProtectionPolicy("example",
            arn=example.arn,
            policy=json.dumps({
                "Description": "Example data protection policy",
                "Name": "__example_data_protection_policy",
                "Statement": [{
                    "DataDirection": "Inbound",
                    "DataIdentifier": ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
                    "Operation": {
                        "Deny": {},
                    },
                    "Principal": ["*"],
                    "Sid": "__deny_statement_11ba9d96",
                }],
                "Version": "2021-06-01",
            }))
        ```

        ## Import

        Using `pulumi import`, import SNS Data Protection Topic Policy using the topic ARN. For example:

        ```sh
         $ pulumi import aws:sns/dataProtectionPolicy:DataProtectionPolicy example arn:aws:sns:us-west-2:0123456789012:example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the SNS topic
        :param pulumi.Input[str] policy: The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataProtectionPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an SNS data protection topic policy resource

        ## Example Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.sns.Topic("example", name="example")
        example_data_protection_policy = aws.sns.DataProtectionPolicy("example",
            arn=example.arn,
            policy=json.dumps({
                "Description": "Example data protection policy",
                "Name": "__example_data_protection_policy",
                "Statement": [{
                    "DataDirection": "Inbound",
                    "DataIdentifier": ["arn:aws:dataprotection::aws:data-identifier/EmailAddress"],
                    "Operation": {
                        "Deny": {},
                    },
                    "Principal": ["*"],
                    "Sid": "__deny_statement_11ba9d96",
                }],
                "Version": "2021-06-01",
            }))
        ```

        ## Import

        Using `pulumi import`, import SNS Data Protection Topic Policy using the topic ARN. For example:

        ```sh
         $ pulumi import aws:sns/dataProtectionPolicy:DataProtectionPolicy example arn:aws:sns:us-west-2:0123456789012:example
        ```

        :param str resource_name: The name of the resource.
        :param DataProtectionPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataProtectionPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataProtectionPolicyArgs.__new__(DataProtectionPolicyArgs)

            if arn is None and not opts.urn:
                raise TypeError("Missing required property 'arn'")
            __props__.__dict__["arn"] = arn
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
        super(DataProtectionPolicy, __self__).__init__(
            'aws:sns/dataProtectionPolicy:DataProtectionPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None) -> 'DataProtectionPolicy':
        """
        Get an existing DataProtectionPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The ARN of the SNS topic
        :param pulumi.Input[str] policy: The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataProtectionPolicyState.__new__(_DataProtectionPolicyState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["policy"] = policy
        return DataProtectionPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN of the SNS topic
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The fully-formed AWS policy as JSON. For more information about building AWS IAM policy documents with this provider, see the AWS IAM Policy Document Guide.
        """
        return pulumi.get(self, "policy")

