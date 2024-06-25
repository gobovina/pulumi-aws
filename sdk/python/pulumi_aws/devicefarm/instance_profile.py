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

__all__ = ['InstanceProfileArgs', 'InstanceProfile']

@pulumi.input_type
class InstanceProfileArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 exclude_app_packages_from_cleanups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 package_cleanup: Optional[pulumi.Input[bool]] = None,
                 reboot_after_use: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a InstanceProfile resource.
        :param pulumi.Input[str] description: The description of the instance profile.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] exclude_app_packages_from_cleanups: An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
        :param pulumi.Input[str] name: The name for the instance profile.
        :param pulumi.Input[bool] package_cleanup: When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
        :param pulumi.Input[bool] reboot_after_use: When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if exclude_app_packages_from_cleanups is not None:
            pulumi.set(__self__, "exclude_app_packages_from_cleanups", exclude_app_packages_from_cleanups)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if package_cleanup is not None:
            pulumi.set(__self__, "package_cleanup", package_cleanup)
        if reboot_after_use is not None:
            pulumi.set(__self__, "reboot_after_use", reboot_after_use)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the instance profile.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="excludeAppPackagesFromCleanups")
    def exclude_app_packages_from_cleanups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
        """
        return pulumi.get(self, "exclude_app_packages_from_cleanups")

    @exclude_app_packages_from_cleanups.setter
    def exclude_app_packages_from_cleanups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "exclude_app_packages_from_cleanups", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the instance profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="packageCleanup")
    def package_cleanup(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
        """
        return pulumi.get(self, "package_cleanup")

    @package_cleanup.setter
    def package_cleanup(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "package_cleanup", value)

    @property
    @pulumi.getter(name="rebootAfterUse")
    def reboot_after_use(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
        """
        return pulumi.get(self, "reboot_after_use")

    @reboot_after_use.setter
    def reboot_after_use(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "reboot_after_use", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _InstanceProfileState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 exclude_app_packages_from_cleanups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 package_cleanup: Optional[pulumi.Input[bool]] = None,
                 reboot_after_use: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering InstanceProfile resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this instance profile.
        :param pulumi.Input[str] description: The description of the instance profile.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] exclude_app_packages_from_cleanups: An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
        :param pulumi.Input[str] name: The name for the instance profile.
        :param pulumi.Input[bool] package_cleanup: When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
        :param pulumi.Input[bool] reboot_after_use: When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if exclude_app_packages_from_cleanups is not None:
            pulumi.set(__self__, "exclude_app_packages_from_cleanups", exclude_app_packages_from_cleanups)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if package_cleanup is not None:
            pulumi.set(__self__, "package_cleanup", package_cleanup)
        if reboot_after_use is not None:
            pulumi.set(__self__, "reboot_after_use", reboot_after_use)
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
        The Amazon Resource Name of this instance profile.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the instance profile.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="excludeAppPackagesFromCleanups")
    def exclude_app_packages_from_cleanups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
        """
        return pulumi.get(self, "exclude_app_packages_from_cleanups")

    @exclude_app_packages_from_cleanups.setter
    def exclude_app_packages_from_cleanups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "exclude_app_packages_from_cleanups", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the instance profile.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="packageCleanup")
    def package_cleanup(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
        """
        return pulumi.get(self, "package_cleanup")

    @package_cleanup.setter
    def package_cleanup(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "package_cleanup", value)

    @property
    @pulumi.getter(name="rebootAfterUse")
    def reboot_after_use(self) -> Optional[pulumi.Input[bool]]:
        """
        When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
        """
        return pulumi.get(self, "reboot_after_use")

    @reboot_after_use.setter
    def reboot_after_use(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "reboot_after_use", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class InstanceProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 exclude_app_packages_from_cleanups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 package_cleanup: Optional[pulumi.Input[bool]] = None,
                 reboot_after_use: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage AWS Device Farm Instance Profiles.
        ∂
        > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.devicefarm.InstanceProfile("example", name="example")
        ```

        ## Import

        Using `pulumi import`, import DeviceFarm Instance Profiles using their ARN. For example:

        ```sh
        $ pulumi import aws:devicefarm/instanceProfile:InstanceProfile example arn:aws:devicefarm:us-west-2:123456789012:instanceprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the instance profile.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] exclude_app_packages_from_cleanups: An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
        :param pulumi.Input[str] name: The name for the instance profile.
        :param pulumi.Input[bool] package_cleanup: When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
        :param pulumi.Input[bool] reboot_after_use: When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[InstanceProfileArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage AWS Device Farm Instance Profiles.
        ∂
        > **NOTE:** AWS currently has limited regional support for Device Farm (e.g., `us-west-2`). See [AWS Device Farm endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/devicefarm.html) for information on supported regions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.devicefarm.InstanceProfile("example", name="example")
        ```

        ## Import

        Using `pulumi import`, import DeviceFarm Instance Profiles using their ARN. For example:

        ```sh
        $ pulumi import aws:devicefarm/instanceProfile:InstanceProfile example arn:aws:devicefarm:us-west-2:123456789012:instanceprofile:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param InstanceProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 exclude_app_packages_from_cleanups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 package_cleanup: Optional[pulumi.Input[bool]] = None,
                 reboot_after_use: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceProfileArgs.__new__(InstanceProfileArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["exclude_app_packages_from_cleanups"] = exclude_app_packages_from_cleanups
            __props__.__dict__["name"] = name
            __props__.__dict__["package_cleanup"] = package_cleanup
            __props__.__dict__["reboot_after_use"] = reboot_after_use
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(InstanceProfile, __self__).__init__(
            'aws:devicefarm/instanceProfile:InstanceProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            exclude_app_packages_from_cleanups: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            package_cleanup: Optional[pulumi.Input[bool]] = None,
            reboot_after_use: Optional[pulumi.Input[bool]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'InstanceProfile':
        """
        Get an existing InstanceProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this instance profile.
        :param pulumi.Input[str] description: The description of the instance profile.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] exclude_app_packages_from_cleanups: An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
        :param pulumi.Input[str] name: The name for the instance profile.
        :param pulumi.Input[bool] package_cleanup: When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
        :param pulumi.Input[bool] reboot_after_use: When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceProfileState.__new__(_InstanceProfileState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["exclude_app_packages_from_cleanups"] = exclude_app_packages_from_cleanups
        __props__.__dict__["name"] = name
        __props__.__dict__["package_cleanup"] = package_cleanup
        __props__.__dict__["reboot_after_use"] = reboot_after_use
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return InstanceProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name of this instance profile.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the instance profile.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="excludeAppPackagesFromCleanups")
    def exclude_app_packages_from_cleanups(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        An array of strings that specifies the list of app packages that should not be cleaned up from the device after a test run.
        """
        return pulumi.get(self, "exclude_app_packages_from_cleanups")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the instance profile.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="packageCleanup")
    def package_cleanup(self) -> pulumi.Output[Optional[bool]]:
        """
        When set to `true`, Device Farm removes app packages after a test run. The default value is `false` for private devices.
        """
        return pulumi.get(self, "package_cleanup")

    @property
    @pulumi.getter(name="rebootAfterUse")
    def reboot_after_use(self) -> pulumi.Output[Optional[bool]]:
        """
        When set to `true`, Device Farm reboots the instance after a test run. The default value is `true`.
        """
        return pulumi.get(self, "reboot_after_use")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

