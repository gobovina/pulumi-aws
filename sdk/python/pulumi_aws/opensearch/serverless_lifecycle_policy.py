# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServerlessLifecyclePolicyArgs', 'ServerlessLifecyclePolicy']

@pulumi.input_type
class ServerlessLifecyclePolicyArgs:
    def __init__(__self__, *,
                 policy: pulumi.Input[str],
                 type: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServerlessLifecyclePolicy resource.
        :param pulumi.Input[str] policy: JSON policy document to use as the content for the new policy.
        :param pulumi.Input[str] type: Type of lifecycle policy. Must be `retention`.
               
               The following arguments are optional:
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Name of the policy.
        """
        pulumi.set(__self__, "policy", policy)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Input[str]:
        """
        JSON policy document to use as the content for the new policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of lifecycle policy. Must be `retention`.

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ServerlessLifecyclePolicyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 policy_version: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServerlessLifecyclePolicy resources.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Name of the policy.
        :param pulumi.Input[str] policy: JSON policy document to use as the content for the new policy.
        :param pulumi.Input[str] policy_version: Version of the policy.
        :param pulumi.Input[str] type: Type of lifecycle policy. Must be `retention`.
               
               The following arguments are optional:
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy is not None:
            pulumi.set(__self__, "policy", policy)
        if policy_version is not None:
            pulumi.set(__self__, "policy_version", policy_version)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the policy.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def policy(self) -> Optional[pulumi.Input[str]]:
        """
        JSON policy document to use as the content for the new policy.
        """
        return pulumi.get(self, "policy")

    @policy.setter
    def policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy", value)

    @property
    @pulumi.getter(name="policyVersion")
    def policy_version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of the policy.
        """
        return pulumi.get(self, "policy_version")

    @policy_version.setter
    def policy_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "policy_version", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of lifecycle policy. Must be `retention`.

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class ServerlessLifecyclePolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS OpenSearch Serverless Lifecycle Policy. See AWS documentation for [lifecycle policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-lifecycle.html).

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.opensearch.ServerlessLifecyclePolicy("example",
            name="example",
            type="retention",
            policy=json.dumps({
                "Rules": [
                    {
                        "ResourceType": "index",
                        "Resource": ["index/autoparts-inventory/*"],
                        "MinIndexRetention": "81d",
                    },
                    {
                        "ResourceType": "index",
                        "Resource": ["index/sales/orders*"],
                        "NoMinIndexRetention": True,
                    },
                ],
            }))
        ```

        ## Import

        Using `pulumi import`, import OpenSearch Serverless Lifecycle Policy using the `name` and `type` arguments separated by a slash (`/`). For example:

        ```sh
         $ pulumi import aws:opensearch/serverlessLifecyclePolicy:ServerlessLifecyclePolicy example example/retention
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Name of the policy.
        :param pulumi.Input[str] policy: JSON policy document to use as the content for the new policy.
        :param pulumi.Input[str] type: Type of lifecycle policy. Must be `retention`.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServerlessLifecyclePolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS OpenSearch Serverless Lifecycle Policy. See AWS documentation for [lifecycle policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-lifecycle.html).

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import json
        import pulumi_aws as aws

        example = aws.opensearch.ServerlessLifecyclePolicy("example",
            name="example",
            type="retention",
            policy=json.dumps({
                "Rules": [
                    {
                        "ResourceType": "index",
                        "Resource": ["index/autoparts-inventory/*"],
                        "MinIndexRetention": "81d",
                    },
                    {
                        "ResourceType": "index",
                        "Resource": ["index/sales/orders*"],
                        "NoMinIndexRetention": True,
                    },
                ],
            }))
        ```

        ## Import

        Using `pulumi import`, import OpenSearch Serverless Lifecycle Policy using the `name` and `type` arguments separated by a slash (`/`). For example:

        ```sh
         $ pulumi import aws:opensearch/serverlessLifecyclePolicy:ServerlessLifecyclePolicy example example/retention
        ```

        :param str resource_name: The name of the resource.
        :param ServerlessLifecyclePolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServerlessLifecyclePolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServerlessLifecyclePolicyArgs.__new__(ServerlessLifecyclePolicyArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if policy is None and not opts.urn:
                raise TypeError("Missing required property 'policy'")
            __props__.__dict__["policy"] = policy
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["policy_version"] = None
        super(ServerlessLifecyclePolicy, __self__).__init__(
            'aws:opensearch/serverlessLifecyclePolicy:ServerlessLifecyclePolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy: Optional[pulumi.Input[str]] = None,
            policy_version: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'ServerlessLifecyclePolicy':
        """
        Get an existing ServerlessLifecyclePolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the policy.
        :param pulumi.Input[str] name: Name of the policy.
        :param pulumi.Input[str] policy: JSON policy document to use as the content for the new policy.
        :param pulumi.Input[str] policy_version: Version of the policy.
        :param pulumi.Input[str] type: Type of lifecycle policy. Must be `retention`.
               
               The following arguments are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServerlessLifecyclePolicyState.__new__(_ServerlessLifecyclePolicyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["policy"] = policy
        __props__.__dict__["policy_version"] = policy_version
        __props__.__dict__["type"] = type
        return ServerlessLifecyclePolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the policy.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the policy.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def policy(self) -> pulumi.Output[str]:
        """
        JSON policy document to use as the content for the new policy.
        """
        return pulumi.get(self, "policy")

    @property
    @pulumi.getter(name="policyVersion")
    def policy_version(self) -> pulumi.Output[str]:
        """
        Version of the policy.
        """
        return pulumi.get(self, "policy_version")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of lifecycle policy. Must be `retention`.

        The following arguments are optional:
        """
        return pulumi.get(self, "type")

