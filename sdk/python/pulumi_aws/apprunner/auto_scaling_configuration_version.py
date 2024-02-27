# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AutoScalingConfigurationVersionArgs', 'AutoScalingConfigurationVersion']

@pulumi.input_type
class AutoScalingConfigurationVersionArgs:
    def __init__(__self__, *,
                 auto_scaling_configuration_name: pulumi.Input[str],
                 max_concurrency: Optional[pulumi.Input[int]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AutoScalingConfigurationVersion resource.
        :param pulumi.Input[str] auto_scaling_configuration_name: Name of the auto scaling configuration.
        :param pulumi.Input[int] max_concurrency: Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
        :param pulumi.Input[int] max_size: Maximal number of instances that App Runner provisions for your service.
        :param pulumi.Input[int] min_size: Minimal number of instances that App Runner provisions for your service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "auto_scaling_configuration_name", auto_scaling_configuration_name)
        if max_concurrency is not None:
            pulumi.set(__self__, "max_concurrency", max_concurrency)
        if max_size is not None:
            pulumi.set(__self__, "max_size", max_size)
        if min_size is not None:
            pulumi.set(__self__, "min_size", min_size)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="autoScalingConfigurationName")
    def auto_scaling_configuration_name(self) -> pulumi.Input[str]:
        """
        Name of the auto scaling configuration.
        """
        return pulumi.get(self, "auto_scaling_configuration_name")

    @auto_scaling_configuration_name.setter
    def auto_scaling_configuration_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "auto_scaling_configuration_name", value)

    @property
    @pulumi.getter(name="maxConcurrency")
    def max_concurrency(self) -> Optional[pulumi.Input[int]]:
        """
        Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
        """
        return pulumi.get(self, "max_concurrency")

    @max_concurrency.setter
    def max_concurrency(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_concurrency", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> Optional[pulumi.Input[int]]:
        """
        Maximal number of instances that App Runner provisions for your service.
        """
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> Optional[pulumi.Input[int]]:
        """
        Minimal number of instances that App Runner provisions for your service.
        """
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _AutoScalingConfigurationVersionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 auto_scaling_configuration_name: Optional[pulumi.Input[str]] = None,
                 auto_scaling_configuration_revision: Optional[pulumi.Input[int]] = None,
                 has_associated_service: Optional[pulumi.Input[bool]] = None,
                 is_default: Optional[pulumi.Input[bool]] = None,
                 latest: Optional[pulumi.Input[bool]] = None,
                 max_concurrency: Optional[pulumi.Input[int]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering AutoScalingConfigurationVersion resources.
        :param pulumi.Input[str] arn: ARN of this auto scaling configuration version.
        :param pulumi.Input[str] auto_scaling_configuration_name: Name of the auto scaling configuration.
        :param pulumi.Input[int] auto_scaling_configuration_revision: The revision of this auto scaling configuration.
        :param pulumi.Input[bool] latest: Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
        :param pulumi.Input[int] max_concurrency: Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
        :param pulumi.Input[int] max_size: Maximal number of instances that App Runner provisions for your service.
        :param pulumi.Input[int] min_size: Minimal number of instances that App Runner provisions for your service.
        :param pulumi.Input[str] status: Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if auto_scaling_configuration_name is not None:
            pulumi.set(__self__, "auto_scaling_configuration_name", auto_scaling_configuration_name)
        if auto_scaling_configuration_revision is not None:
            pulumi.set(__self__, "auto_scaling_configuration_revision", auto_scaling_configuration_revision)
        if has_associated_service is not None:
            pulumi.set(__self__, "has_associated_service", has_associated_service)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if latest is not None:
            pulumi.set(__self__, "latest", latest)
        if max_concurrency is not None:
            pulumi.set(__self__, "max_concurrency", max_concurrency)
        if max_size is not None:
            pulumi.set(__self__, "max_size", max_size)
        if min_size is not None:
            pulumi.set(__self__, "min_size", min_size)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of this auto scaling configuration version.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="autoScalingConfigurationName")
    def auto_scaling_configuration_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the auto scaling configuration.
        """
        return pulumi.get(self, "auto_scaling_configuration_name")

    @auto_scaling_configuration_name.setter
    def auto_scaling_configuration_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "auto_scaling_configuration_name", value)

    @property
    @pulumi.getter(name="autoScalingConfigurationRevision")
    def auto_scaling_configuration_revision(self) -> Optional[pulumi.Input[int]]:
        """
        The revision of this auto scaling configuration.
        """
        return pulumi.get(self, "auto_scaling_configuration_revision")

    @auto_scaling_configuration_revision.setter
    def auto_scaling_configuration_revision(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "auto_scaling_configuration_revision", value)

    @property
    @pulumi.getter(name="hasAssociatedService")
    def has_associated_service(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "has_associated_service")

    @has_associated_service.setter
    def has_associated_service(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "has_associated_service", value)

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_default", value)

    @property
    @pulumi.getter
    def latest(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
        """
        return pulumi.get(self, "latest")

    @latest.setter
    def latest(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "latest", value)

    @property
    @pulumi.getter(name="maxConcurrency")
    def max_concurrency(self) -> Optional[pulumi.Input[int]]:
        """
        Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
        """
        return pulumi.get(self, "max_concurrency")

    @max_concurrency.setter
    def max_concurrency(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_concurrency", value)

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> Optional[pulumi.Input[int]]:
        """
        Maximal number of instances that App Runner provisions for your service.
        """
        return pulumi.get(self, "max_size")

    @max_size.setter
    def max_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_size", value)

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> Optional[pulumi.Input[int]]:
        """
        Minimal number of instances that App Runner provisions for your service.
        """
        return pulumi.get(self, "min_size")

    @min_size.setter
    def min_size(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_size", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class AutoScalingConfigurationVersion(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_scaling_configuration_name: Optional[pulumi.Input[str]] = None,
                 max_concurrency: Optional[pulumi.Input[int]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Manages an App Runner AutoScaling Configuration Version.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apprunner.AutoScalingConfigurationVersion("example",
            auto_scaling_configuration_name="example",
            max_concurrency=50,
            max_size=10,
            min_size=2,
            tags={
                "Name": "example-apprunner-autoscaling",
            })
        ```

        ## Import

        Using `pulumi import`, import App Runner AutoScaling Configuration Versions using the `arn`. For example:

        ```sh
         $ pulumi import aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion example "arn:aws:apprunner:us-east-1:1234567890:autoscalingconfiguration/example/1/69bdfe0115224b0db49398b7beb68e0f
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] auto_scaling_configuration_name: Name of the auto scaling configuration.
        :param pulumi.Input[int] max_concurrency: Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
        :param pulumi.Input[int] max_size: Maximal number of instances that App Runner provisions for your service.
        :param pulumi.Input[int] min_size: Minimal number of instances that App Runner provisions for your service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AutoScalingConfigurationVersionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an App Runner AutoScaling Configuration Version.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.apprunner.AutoScalingConfigurationVersion("example",
            auto_scaling_configuration_name="example",
            max_concurrency=50,
            max_size=10,
            min_size=2,
            tags={
                "Name": "example-apprunner-autoscaling",
            })
        ```

        ## Import

        Using `pulumi import`, import App Runner AutoScaling Configuration Versions using the `arn`. For example:

        ```sh
         $ pulumi import aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion example "arn:aws:apprunner:us-east-1:1234567890:autoscalingconfiguration/example/1/69bdfe0115224b0db49398b7beb68e0f
        ```

        :param str resource_name: The name of the resource.
        :param AutoScalingConfigurationVersionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AutoScalingConfigurationVersionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_scaling_configuration_name: Optional[pulumi.Input[str]] = None,
                 max_concurrency: Optional[pulumi.Input[int]] = None,
                 max_size: Optional[pulumi.Input[int]] = None,
                 min_size: Optional[pulumi.Input[int]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AutoScalingConfigurationVersionArgs.__new__(AutoScalingConfigurationVersionArgs)

            if auto_scaling_configuration_name is None and not opts.urn:
                raise TypeError("Missing required property 'auto_scaling_configuration_name'")
            __props__.__dict__["auto_scaling_configuration_name"] = auto_scaling_configuration_name
            __props__.__dict__["max_concurrency"] = max_concurrency
            __props__.__dict__["max_size"] = max_size
            __props__.__dict__["min_size"] = min_size
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["auto_scaling_configuration_revision"] = None
            __props__.__dict__["has_associated_service"] = None
            __props__.__dict__["is_default"] = None
            __props__.__dict__["latest"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["tags_all"] = None
        super(AutoScalingConfigurationVersion, __self__).__init__(
            'aws:apprunner/autoScalingConfigurationVersion:AutoScalingConfigurationVersion',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            auto_scaling_configuration_name: Optional[pulumi.Input[str]] = None,
            auto_scaling_configuration_revision: Optional[pulumi.Input[int]] = None,
            has_associated_service: Optional[pulumi.Input[bool]] = None,
            is_default: Optional[pulumi.Input[bool]] = None,
            latest: Optional[pulumi.Input[bool]] = None,
            max_concurrency: Optional[pulumi.Input[int]] = None,
            max_size: Optional[pulumi.Input[int]] = None,
            min_size: Optional[pulumi.Input[int]] = None,
            status: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'AutoScalingConfigurationVersion':
        """
        Get an existing AutoScalingConfigurationVersion resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of this auto scaling configuration version.
        :param pulumi.Input[str] auto_scaling_configuration_name: Name of the auto scaling configuration.
        :param pulumi.Input[int] auto_scaling_configuration_revision: The revision of this auto scaling configuration.
        :param pulumi.Input[bool] latest: Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
        :param pulumi.Input[int] max_concurrency: Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
        :param pulumi.Input[int] max_size: Maximal number of instances that App Runner provisions for your service.
        :param pulumi.Input[int] min_size: Minimal number of instances that App Runner provisions for your service.
        :param pulumi.Input[str] status: Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AutoScalingConfigurationVersionState.__new__(_AutoScalingConfigurationVersionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["auto_scaling_configuration_name"] = auto_scaling_configuration_name
        __props__.__dict__["auto_scaling_configuration_revision"] = auto_scaling_configuration_revision
        __props__.__dict__["has_associated_service"] = has_associated_service
        __props__.__dict__["is_default"] = is_default
        __props__.__dict__["latest"] = latest
        __props__.__dict__["max_concurrency"] = max_concurrency
        __props__.__dict__["max_size"] = max_size
        __props__.__dict__["min_size"] = min_size
        __props__.__dict__["status"] = status
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return AutoScalingConfigurationVersion(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of this auto scaling configuration version.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="autoScalingConfigurationName")
    def auto_scaling_configuration_name(self) -> pulumi.Output[str]:
        """
        Name of the auto scaling configuration.
        """
        return pulumi.get(self, "auto_scaling_configuration_name")

    @property
    @pulumi.getter(name="autoScalingConfigurationRevision")
    def auto_scaling_configuration_revision(self) -> pulumi.Output[int]:
        """
        The revision of this auto scaling configuration.
        """
        return pulumi.get(self, "auto_scaling_configuration_revision")

    @property
    @pulumi.getter(name="hasAssociatedService")
    def has_associated_service(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "has_associated_service")

    @property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> pulumi.Output[bool]:
        return pulumi.get(self, "is_default")

    @property
    @pulumi.getter
    def latest(self) -> pulumi.Output[bool]:
        """
        Whether the auto scaling configuration has the highest `auto_scaling_configuration_revision` among all configurations that share the same `auto_scaling_configuration_name`.
        """
        return pulumi.get(self, "latest")

    @property
    @pulumi.getter(name="maxConcurrency")
    def max_concurrency(self) -> pulumi.Output[Optional[int]]:
        """
        Maximal number of concurrent requests that you want an instance to process. When the number of concurrent requests goes over this limit, App Runner scales up your service.
        """
        return pulumi.get(self, "max_concurrency")

    @property
    @pulumi.getter(name="maxSize")
    def max_size(self) -> pulumi.Output[Optional[int]]:
        """
        Maximal number of instances that App Runner provisions for your service.
        """
        return pulumi.get(self, "max_size")

    @property
    @pulumi.getter(name="minSize")
    def min_size(self) -> pulumi.Output[Optional[int]]:
        """
        Minimal number of instances that App Runner provisions for your service.
        """
        return pulumi.get(self, "min_size")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Current state of the auto scaling configuration. An INACTIVE configuration revision has been deleted and can't be used. It is permanently removed some time after deletion.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

