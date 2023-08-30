# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ContainerPolicyArgs', 'ContainerPolicy']

@pulumi.input_type
class ContainerPolicyArgs:
    def __init__(__self__, *,
                 container_name: pulumi.Input[str],
                 policy: pulumi.Input[str]):
        """
        The set of arguments for constructing a ContainerPolicy resource.
        :param pulumi.Input[str] container_name: The name of the container.
        :param pulumi.Input[str] policy: The contents of the policy.
        """
        pulumi.set(__self__, "container_name", container_name)
        pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Input[str]:
        """
        The name of the container.
        """
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "container_name", value)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        The contents of the policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)


@pulumi.input_type
class _ContainerPolicyState:
    def __init__(__self__, *,
                 container_name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ContainerPolicy resources.
        :param pulumi.Input[str] container_name: The name of the container.
        :param pulumi.Input[str] policy: The contents of the policy.
        """
        if container_name is not None:
            pulumi.set(__self__, "container_name", container_name)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the container.
        """
        return pulumi.get(self, "container_name")

    @container_name.setter
    def container_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_name", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        The contents of the policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)


class ContainerPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a MediaStore Container Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        current_region = aws.get_region()
        current_caller_identity = aws.get_caller_identity()
        example_container = aws.mediastore.Container("exampleContainer")
        example_policy_document = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="MediaStoreFullAccess",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[f"arn:aws:iam::{current_caller_identity.account_id}:root"],
            )],
            actions=["mediastore:*"],
            resources=[example_container.name.apply(lambda name: f"arn:aws:mediastore:{current_region.name}:{current_caller_identity.account_id}:container/{name}/*")],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="Bool",
                variable="aws:SecureTransport",
                values=["true"],
            )],
        )])
        example_container_policy = aws.mediastore.ContainerPolicy("exampleContainerPolicy",
            container_name=example_container.name,
            policy=example_policy_document.json)
        ```

        ## Import

        Using `pulumi import`, import MediaStore Container Policy using the MediaStore Container Name. For example:

        ```sh
         $ pulumi import aws:mediastore/containerPolicy:ContainerPolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] container_name: The name of the container.
        :param pulumi.Input[str] policy: The contents of the policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ContainerPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a MediaStore Container Policy.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        current_region = aws.get_region()
        current_caller_identity = aws.get_caller_identity()
        example_container = aws.mediastore.Container("exampleContainer")
        example_policy_document = aws.iam.get_policy_document_output(statements=[aws.iam.GetPolicyDocumentStatementArgs(
            sid="MediaStoreFullAccess",
            effect="Allow",
            principals=[aws.iam.GetPolicyDocumentStatementPrincipalArgs(
                type="AWS",
                identifiers=[f"arn:aws:iam::{current_caller_identity.account_id}:root"],
            )],
            actions=["mediastore:*"],
            resources=[example_container.name.apply(lambda name: f"arn:aws:mediastore:{current_region.name}:{current_caller_identity.account_id}:container/{name}/*")],
            conditions=[aws.iam.GetPolicyDocumentStatementConditionArgs(
                test="Bool",
                variable="aws:SecureTransport",
                values=["true"],
            )],
        )])
        example_container_policy = aws.mediastore.ContainerPolicy("exampleContainerPolicy",
            container_name=example_container.name,
            policy=example_policy_document.json)
        ```

        ## Import

        Using `pulumi import`, import MediaStore Container Policy using the MediaStore Container Name. For example:

        ```sh
         $ pulumi import aws:mediastore/containerPolicy:ContainerPolicy example example
        ```

        :param str resource_name: The name of the resource.
        :param ContainerPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ContainerPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 container_name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ContainerPolicyArgs.__new__(ContainerPolicyArgs)

            if container_name is None and not opts.urn:
                raise TypeError("Missing required property 'container_name'")
            __props__.__dict__["container_name"] = container_name
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
        super(ContainerPolicy, __self__).__init__(
            'aws:mediastore/containerPolicy:ContainerPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            container_name: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None) -> 'ContainerPolicy':
        """
        Get an existing ContainerPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] container_name: The name of the container.
        :param pulumi.Input[str] policy: The contents of the policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ContainerPolicyState.__new__(_ContainerPolicyState)

        __props__.__dict__["container_name"] = container_name
        __props__.__dict__["policy"] = policy
        return ContainerPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="containerName")
    def container_name(self) -> pulumi.Output[str]:
        """
        The name of the container.
        """
        return pulumi.get(self, "container_name")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        The contents of the policy.
        """
        return pulumi.get(self, "policy")

