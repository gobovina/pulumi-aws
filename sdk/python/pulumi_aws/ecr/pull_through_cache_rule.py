# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PullThroughCacheRuleArgs', 'PullThroughCacheRule']

@pulumi.input_type
class PullThroughCacheRuleArgs:
    def __init__(__self__, *,
                 ecr_repository_prefix: pulumi.Input[str],
                 upstream_registry_url: pulumi.Input[str]):
        """
        The set of arguments for constructing a PullThroughCacheRule resource.
        :param pulumi.Input[str] ecr_repository_prefix: The repository name prefix to use when caching images from the source registry.
        :param pulumi.Input[str] upstream_registry_url: The registry URL of the upstream public registry to use as the source.
        """
        pulumi.set(__self__, "ecr_repository_prefix", ecr_repository_prefix)
        pulumi.set(__self__, "upstream_registry_url", upstream_registry_url)

    @property
    @pulumi.getter(name="ecrRepositoryPrefix")
    def ecr_repository_prefix(self) -> pulumi.Input[str]:
        """
        The repository name prefix to use when caching images from the source registry.
        """
        return pulumi.get(self, "ecr_repository_prefix")

    @ecr_repository_prefix.setter
    def ecr_repository_prefix(self, value: pulumi.Input[str]):
        pulumi.set(self, "ecr_repository_prefix", value)

    @property
    @pulumi.getter(name="upstreamRegistryUrl")
    def upstream_registry_url(self) -> pulumi.Input[str]:
        """
        The registry URL of the upstream public registry to use as the source.
        """
        return pulumi.get(self, "upstream_registry_url")

    @upstream_registry_url.setter
    def upstream_registry_url(self, value: pulumi.Input[str]):
        pulumi.set(self, "upstream_registry_url", value)


@pulumi.input_type
class _PullThroughCacheRuleState:
    def __init__(__self__, *,
                 ecr_repository_prefix: Optional[pulumi.Input[str]] = None,
                 registry_id: Optional[pulumi.Input[str]] = None,
                 upstream_registry_url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering PullThroughCacheRule resources.
        :param pulumi.Input[str] ecr_repository_prefix: The repository name prefix to use when caching images from the source registry.
        :param pulumi.Input[str] registry_id: The registry ID where the repository was created.
        :param pulumi.Input[str] upstream_registry_url: The registry URL of the upstream public registry to use as the source.
        """
        if ecr_repository_prefix is not None:
            pulumi.set(__self__, "ecr_repository_prefix", ecr_repository_prefix)
        if registry_id is not None:
            pulumi.set(__self__, "registry_id", registry_id)
        if upstream_registry_url is not None:
            pulumi.set(__self__, "upstream_registry_url", upstream_registry_url)

    @property
    @pulumi.getter(name="ecrRepositoryPrefix")
    def ecr_repository_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        The repository name prefix to use when caching images from the source registry.
        """
        return pulumi.get(self, "ecr_repository_prefix")

    @ecr_repository_prefix.setter
    def ecr_repository_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ecr_repository_prefix", value)

    @property
    @pulumi.getter(name="registryId")
    def registry_id(self) -> Optional[pulumi.Input[str]]:
        """
        The registry ID where the repository was created.
        """
        return pulumi.get(self, "registry_id")

    @registry_id.setter
    def registry_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "registry_id", value)

    @property
    @pulumi.getter(name="upstreamRegistryUrl")
    def upstream_registry_url(self) -> Optional[pulumi.Input[str]]:
        """
        The registry URL of the upstream public registry to use as the source.
        """
        return pulumi.get(self, "upstream_registry_url")

    @upstream_registry_url.setter
    def upstream_registry_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "upstream_registry_url", value)


class PullThroughCacheRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ecr_repository_prefix: Optional[pulumi.Input[str]] = None,
                 upstream_registry_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Elastic Container Registry Pull Through Cache Rule.

        More information about pull through cache rules, including the set of supported
        upstream repositories, see [Using pull through cache rules](https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ecr.PullThroughCacheRule("example",
            ecr_repository_prefix="ecr-public",
            upstream_registry_url="public.ecr.aws")
        ```

        ## Import

        Using `pulumi import`, import a pull-through cache rule using the `ecr_repository_prefix`. For example:

        ```sh
         $ pulumi import aws:ecr/pullThroughCacheRule:PullThroughCacheRule example ecr-public
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ecr_repository_prefix: The repository name prefix to use when caching images from the source registry.
        :param pulumi.Input[str] upstream_registry_url: The registry URL of the upstream public registry to use as the source.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PullThroughCacheRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Elastic Container Registry Pull Through Cache Rule.

        More information about pull through cache rules, including the set of supported
        upstream repositories, see [Using pull through cache rules](https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.ecr.PullThroughCacheRule("example",
            ecr_repository_prefix="ecr-public",
            upstream_registry_url="public.ecr.aws")
        ```

        ## Import

        Using `pulumi import`, import a pull-through cache rule using the `ecr_repository_prefix`. For example:

        ```sh
         $ pulumi import aws:ecr/pullThroughCacheRule:PullThroughCacheRule example ecr-public
        ```

        :param str resource_name: The name of the resource.
        :param PullThroughCacheRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PullThroughCacheRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ecr_repository_prefix: Optional[pulumi.Input[str]] = None,
                 upstream_registry_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PullThroughCacheRuleArgs.__new__(PullThroughCacheRuleArgs)

            if ecr_repository_prefix is None and not opts.urn:
                raise TypeError("Missing required property 'ecr_repository_prefix'")
            __props__.__dict__["ecr_repository_prefix"] = ecr_repository_prefix
            if upstream_registry_url is None and not opts.urn:
                raise TypeError("Missing required property 'upstream_registry_url'")
            __props__.__dict__["upstream_registry_url"] = upstream_registry_url
            __props__.__dict__["registry_id"] = None
        super(PullThroughCacheRule, __self__).__init__(
            'aws:ecr/pullThroughCacheRule:PullThroughCacheRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ecr_repository_prefix: Optional[pulumi.Input[str]] = None,
            registry_id: Optional[pulumi.Input[str]] = None,
            upstream_registry_url: Optional[pulumi.Input[str]] = None) -> 'PullThroughCacheRule':
        """
        Get an existing PullThroughCacheRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ecr_repository_prefix: The repository name prefix to use when caching images from the source registry.
        :param pulumi.Input[str] registry_id: The registry ID where the repository was created.
        :param pulumi.Input[str] upstream_registry_url: The registry URL of the upstream public registry to use as the source.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PullThroughCacheRuleState.__new__(_PullThroughCacheRuleState)

        __props__.__dict__["ecr_repository_prefix"] = ecr_repository_prefix
        __props__.__dict__["registry_id"] = registry_id
        __props__.__dict__["upstream_registry_url"] = upstream_registry_url
        return PullThroughCacheRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="ecrRepositoryPrefix")
    def ecr_repository_prefix(self) -> pulumi.Output[str]:
        """
        The repository name prefix to use when caching images from the source registry.
        """
        return pulumi.get(self, "ecr_repository_prefix")

    @property
    @pulumi.getter(name="registryId")
    def registry_id(self) -> pulumi.Output[str]:
        """
        The registry ID where the repository was created.
        """
        return pulumi.get(self, "registry_id")

    @property
    @pulumi.getter(name="upstreamRegistryUrl")
    def upstream_registry_url(self) -> pulumi.Output[str]:
        """
        The registry URL of the upstream public registry to use as the source.
        """
        return pulumi.get(self, "upstream_registry_url")

