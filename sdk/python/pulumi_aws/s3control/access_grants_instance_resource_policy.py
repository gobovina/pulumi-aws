# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

__all__ = ['AccessGrantsInstanceResourcePolicyArgs', 'AccessGrantsInstanceResourcePolicy']

@pulumi.input_type
class AccessGrantsInstanceResourcePolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessGrantsInstanceResourcePolicy resource.
        :param pulumi.Input[str] policy: The policy document.
        """
        pulumi.set(__self__, "policy", policy)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The policy document.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)


@pulumi.input_type
class _AccessGrantsInstanceResourcePolicyState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AccessGrantsInstanceResourcePolicy resources.
        :param pulumi.Input[str] policy: The policy document.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The policy document.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)


class AccessGrantsInstanceResourcePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a resource to manage an S3 Access Grants instance resource policy.
        Use a resource policy to manage cross-account access to your S3 Access Grants instance.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3control.AccessGrantsInstance("example")
        example_access_grants_instance_resource_policy = aws.s3control.AccessGrantsInstanceResourcePolicy("example", policy=example.access_grants_instance_arn.apply(lambda access_grants_instance_arn: f\"\"\"{{
          "Version": "2012-10-17",
          "Id": "S3AccessGrantsPolicy",
          "Statement": [{{
            "Sid": "AllowAccessToS3AccessGrants",
            "Effect": "Allow",
            "Principal": {{
              "AWS": "123456789456"
            }},
            "Action": [
              "s3:ListAccessGrants",
              "s3:ListAccessGrantsLocations",
              "s3:GetDataAccess"
            ],
            "Resource": "{access_grants_instance_arn}"
          }}]
        }}
        \"\"\"))
        ```

        ## Import

        Using `pulumi import`, import S3 Access Grants instance resource policies using the `account_id`. For example:

        ```sh
        $ pulumi import aws:s3control/accessGrantsInstanceResourcePolicy:AccessGrantsInstanceResourcePolicy example 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The policy document.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessGrantsInstanceResourcePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage an S3 Access Grants instance resource policy.
        Use a resource policy to manage cross-account access to your S3 Access Grants instance.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.s3control.AccessGrantsInstance("example")
        example_access_grants_instance_resource_policy = aws.s3control.AccessGrantsInstanceResourcePolicy("example", policy=example.access_grants_instance_arn.apply(lambda access_grants_instance_arn: f\"\"\"{{
          "Version": "2012-10-17",
          "Id": "S3AccessGrantsPolicy",
          "Statement": [{{
            "Sid": "AllowAccessToS3AccessGrants",
            "Effect": "Allow",
            "Principal": {{
              "AWS": "123456789456"
            }},
            "Action": [
              "s3:ListAccessGrants",
              "s3:ListAccessGrantsLocations",
              "s3:GetDataAccess"
            ],
            "Resource": "{access_grants_instance_arn}"
          }}]
        }}
        \"\"\"))
        ```

        ## Import

        Using `pulumi import`, import S3 Access Grants instance resource policies using the `account_id`. For example:

        ```sh
        $ pulumi import aws:s3control/accessGrantsInstanceResourcePolicy:AccessGrantsInstanceResourcePolicy example 123456789012
        ```

        :param str resource_name: The name of the resource.
        :param AccessGrantsInstanceResourcePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessGrantsInstanceResourcePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccessGrantsInstanceResourcePolicyArgs.__new__(AccessGrantsInstanceResourcePolicyArgs)

            __props__.__dict__["account_id"] = account_id
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
        super(AccessGrantsInstanceResourcePolicy, __self__).__init__(
            'aws:s3control/accessGrantsInstanceResourcePolicy:AccessGrantsInstanceResourcePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None) -> 'AccessGrantsInstanceResourcePolicy':
        """
        Get an existing AccessGrantsInstanceResourcePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: The policy document.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccessGrantsInstanceResourcePolicyState.__new__(_AccessGrantsInstanceResourcePolicyState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["policy"] = policy
        return AccessGrantsInstanceResourcePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The policy document.
        """
        return pulumi.get(self, "policy")

