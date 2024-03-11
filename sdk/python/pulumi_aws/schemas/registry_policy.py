# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RegistryPolicyArgs', 'RegistryPolicy']

@pulumi.input_type
class RegistryPolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 registry_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a RegistryPolicy resource.
        :param pulumi.Input[str] policy: Resource Policy for EventBridge Schema Registry
        :param pulumi.Input[str] registry_name: Name of EventBridge Schema Registry
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "registry_name", registry_name)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        Resource Policy for EventBridge Schema Registry
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="registryName")
    def registry_name(self) -> pulumi.Input[str]:
        """
        Name of EventBridge Schema Registry
        """
        return pulumi.get(self, "registry_name")

    @registry_name.setter
    def registry_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "registry_name", value)


@pulumi.input_type
class _RegistryPolicyState:
    def __init__(__self__, *,
                 policy: Optional[pulumi.Input[str]] = None,
                 registry_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RegistryPolicy resources.
        :param pulumi.Input[str] policy: Resource Policy for EventBridge Schema Registry
        :param pulumi.Input[str] registry_name: Name of EventBridge Schema Registry
        """
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if registry_name is not None:
            pulumi.set(__self__, "registry_name", registry_name)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        Resource Policy for EventBridge Schema Registry
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="registryName")
    def registry_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of EventBridge Schema Registry
        """
        return pulumi.get(self, "registry_name")

    @registry_name.setter
    def registry_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "registry_name", value)


class RegistryPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 registry_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS EventBridge Schemas Registry Policy.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="example",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=["109876543210"],
            )],
            actions=["schemas:*"],
            resources=[
                "arn:aws:schemas:us-east-1:012345678901:registry/example",
                "arn:aws:schemas:us-east-1:012345678901:schema/example*",
            ],
        )])
        example_registry_policy = aws.schemas.RegistryPolicy("example",
            registry_name="example",
            policy=example.json)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import EventBridge Schema Registry Policy using the `registry_name`. For example:

        ```sh
        $ pulumi import aws:schemas/registryPolicy:RegistryPolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: Resource Policy for EventBridge Schema Registry
        :param pulumi.Input[str] registry_name: Name of EventBridge Schema Registry
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RegistryPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS EventBridge Schemas Registry Policy.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iam.get_policy_document(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="example",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=["109876543210"],
            )],
            actions=["schemas:*"],
            resources=[
                "arn:aws:schemas:us-east-1:012345678901:registry/example",
                "arn:aws:schemas:us-east-1:012345678901:schema/example*",
            ],
        )])
        example_registry_policy = aws.schemas.RegistryPolicy("example",
            registry_name="example",
            policy=example.json)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import EventBridge Schema Registry Policy using the `registry_name`. For example:

        ```sh
        $ pulumi import aws:schemas/registryPolicy:RegistryPolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param RegistryPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RegistryPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 registry_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RegistryPolicyArgs.__new__(RegistryPolicyArgs)

            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if registry_name is None and not opts.urn:
                raise TypeError("Missing required property 'registry_name'")
            __props__.__dict__["registry_name"] = registry_name
        super(RegistryPolicy, __self__).__init__(
            'aws:schemas/registryPolicy:RegistryPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            policy: Optional[pulumi.Input[str]] = None,
            registry_name: Optional[pulumi.Input[str]] = None) -> 'RegistryPolicy':
        """
        Get an existing RegistryPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] policy: Resource Policy for EventBridge Schema Registry
        :param pulumi.Input[str] registry_name: Name of EventBridge Schema Registry
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RegistryPolicyState.__new__(_RegistryPolicyState)

        __props__.__dict__["policy"] = policy
        __props__.__dict__["registry_name"] = registry_name
        return RegistryPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        Resource Policy for EventBridge Schema Registry
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="registryName")
    def registry_name(self) -> pulumi.Output[str]:
        """
        Name of EventBridge Schema Registry
        """
        return pulumi.get(self, "registry_name")

