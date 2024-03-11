# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ResourcePolicyArgs', 'ResourcePolicy']

@pulumi.input_type
class ResourcePolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 resource_arn: pulumi.Input[str]):
        """
        The set of arguments for constructing a ResourcePolicy resource.
        :param pulumi.Input[str] policy: The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "resource_arn", resource_arn)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_arn", value)


@pulumi.input_type
class _ResourcePolicyState:
    def __init__(__self__, *,
                 policy: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ResourcePolicy resources.
        :param pulumi.Input[str] policy: The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
        """
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if resource_arn is not None:
            pulumi.set(__self__, "resource_arn", resource_arn)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_arn", value)


class ResourcePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a new Amazon Redshift Serverless Resource Policy.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.redshiftserverless.ResourcePolicy("example",
            resource_arn=example_aws_redshiftserverless_snapshot["arn"],
            policy=json.dumps({
                "version": "2012-10-17",
                "statement": [{
                    "effect": "Allow",
                    "principal": {
                        "AWS": ["12345678901"],
                    },
                    "action": ["redshift-serverless:RestoreFromSnapshot"],
                    "sid": "",
                }],
            }))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Redshift Serverless Resource Policies using the `resource_arn`. For example:

        ```sh
        $ pulumi import aws:redshiftserverless/resourcePolicy:ResourcePolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourcePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a new Amazon Redshift Serverless Resource Policy.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.redshiftserverless.ResourcePolicy("example",
            resource_arn=example_aws_redshiftserverless_snapshot["arn"],
            policy=json.dumps({
                "version": "2012-10-17",
                "statement": [{
                    "effect": "Allow",
                    "principal": {
                        "AWS": ["12345678901"],
                    },
                    "action": ["redshift-serverless:RestoreFromSnapshot"],
                    "sid": "",
                }],
            }))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Redshift Serverless Resource Policies using the `resource_arn`. For example:

        ```sh
        $ pulumi import aws:redshiftserverless/resourcePolicy:ResourcePolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param ResourcePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourcePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourcePolicyArgs.__new__(ResourcePolicyArgs)

            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if resource_arn is None and not opts.urn:
                raise TypeError("Missing required property 'resource_arn'")
            __props__.__dict__["resource_arn"] = resource_arn
        super(ResourcePolicy, __self__).__init__(
            'aws:redshiftserverless/resourcePolicy:ResourcePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy: Optional[pulumi.Input[str]] = None,
            resource_arn: Optional[pulumi.Input[str]] = None) -> 'ResourcePolicy':
        """
        Get an existing ResourcePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourcePolicyState.__new__(_ResourcePolicyState)

        __props__.__dict__["policy"] = policy
        __props__.__dict__["resource_arn"] = resource_arn
        return ResourcePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The policy to create or update. For example, the following policy grants a user authorization to restore a snapshot.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the account to create or update a resource policy for.
        """
        return pulumi.get(self, "resource_arn")

