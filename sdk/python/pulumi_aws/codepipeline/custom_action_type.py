# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CustomActionTypeArgs', 'CustomActionType']

@pulumi.input_type
class CustomActionTypeArgs:
    def __init__(__self__, *,
                 category: pulumi.Input[str],
                 input_artifact_details: pulumi.Input['CustomActionTypeInputArtifactDetailsArgs'],
                 output_artifact_details: pulumi.Input['CustomActionTypeOutputArtifactDetailsArgs'],
                 provider_name: pulumi.Input[str],
                 version: pulumi.Input[str],
                 configuration_properties: Optional[pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]]] = None,
                 settings: Optional[pulumi.Input['CustomActionTypeSettingsArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a CustomActionType resource.
        :param pulumi.Input[str] category: The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
        :param pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]] configuration_properties: The configuration properties for the custom action. Max 10 items.
        """
        pulumi.set(__self__, "category", category)
        pulumi.set(__self__, "input_artifact_details", input_artifact_details)
        pulumi.set(__self__, "output_artifact_details", output_artifact_details)
        pulumi.set(__self__, "provider_name", provider_name)
        pulumi.set(__self__, "version", version)
        if configuration_properties is not None:
            pulumi.set(__self__, "configuration_properties", configuration_properties)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def category(self) -> pulumi.Input[str]:
        """
        The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: pulumi.Input[str]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter(name="inputArtifactDetails")
    def input_artifact_details(self) -> pulumi.Input['CustomActionTypeInputArtifactDetailsArgs']:
        return pulumi.get(self, "input_artifact_details")

    @input_artifact_details.setter
    def input_artifact_details(self, value: pulumi.Input['CustomActionTypeInputArtifactDetailsArgs']):
        pulumi.set(self, "input_artifact_details", value)

    @property
    @pulumi.getter(name="outputArtifactDetails")
    def output_artifact_details(self) -> pulumi.Input['CustomActionTypeOutputArtifactDetailsArgs']:
        return pulumi.get(self, "output_artifact_details")

    @output_artifact_details.setter
    def output_artifact_details(self, value: pulumi.Input['CustomActionTypeOutputArtifactDetailsArgs']):
        pulumi.set(self, "output_artifact_details", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter(name="configurationProperties")
    def configuration_properties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]]]:
        """
        The configuration properties for the custom action. Max 10 items.
        """
        return pulumi.get(self, "configuration_properties")

    @configuration_properties.setter
    def configuration_properties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]]]):
        pulumi.set(self, "configuration_properties", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['CustomActionTypeSettingsArgs']]:
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['CustomActionTypeSettingsArgs']]):
        pulumi.set(self, "settings", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _CustomActionTypeState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 category: Optional[pulumi.Input[str]] = None,
                 configuration_properties: Optional[pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]]] = None,
                 input_artifact_details: Optional[pulumi.Input['CustomActionTypeInputArtifactDetailsArgs']] = None,
                 output_artifact_details: Optional[pulumi.Input['CustomActionTypeOutputArtifactDetailsArgs']] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 settings: Optional[pulumi.Input['CustomActionTypeSettingsArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomActionType resources.
        :param pulumi.Input[str] arn: The action ARN.
        :param pulumi.Input[str] category: The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
        :param pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]] configuration_properties: The configuration properties for the custom action. Max 10 items.
        :param pulumi.Input[str] owner: The creator of the action being called.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if category is not None:
            pulumi.set(__self__, "category", category)
        if configuration_properties is not None:
            pulumi.set(__self__, "configuration_properties", configuration_properties)
        if input_artifact_details is not None:
            pulumi.set(__self__, "input_artifact_details", input_artifact_details)
        if output_artifact_details is not None:
            pulumi.set(__self__, "output_artifact_details", output_artifact_details)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if provider_name is not None:
            pulumi.set(__self__, "provider_name", provider_name)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The action ARN.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def category(self) -> Optional[pulumi.Input[str]]:
        """
        The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter(name="configurationProperties")
    def configuration_properties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]]]:
        """
        The configuration properties for the custom action. Max 10 items.
        """
        return pulumi.get(self, "configuration_properties")

    @configuration_properties.setter
    def configuration_properties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomActionTypeConfigurationPropertyArgs']]]]):
        pulumi.set(self, "configuration_properties", value)

    @property
    @pulumi.getter(name="inputArtifactDetails")
    def input_artifact_details(self) -> Optional[pulumi.Input['CustomActionTypeInputArtifactDetailsArgs']]:
        return pulumi.get(self, "input_artifact_details")

    @input_artifact_details.setter
    def input_artifact_details(self, value: Optional[pulumi.Input['CustomActionTypeInputArtifactDetailsArgs']]):
        pulumi.set(self, "input_artifact_details", value)

    @property
    @pulumi.getter(name="outputArtifactDetails")
    def output_artifact_details(self) -> Optional[pulumi.Input['CustomActionTypeOutputArtifactDetailsArgs']]:
        return pulumi.get(self, "output_artifact_details")

    @output_artifact_details.setter
    def output_artifact_details(self, value: Optional[pulumi.Input['CustomActionTypeOutputArtifactDetailsArgs']]):
        pulumi.set(self, "output_artifact_details", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        The creator of the action being called.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['CustomActionTypeSettingsArgs']]:
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['CustomActionTypeSettingsArgs']]):
        pulumi.set(self, "settings", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
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

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class CustomActionType(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 category: Optional[pulumi.Input[str]] = None,
                 configuration_properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomActionTypeConfigurationPropertyArgs']]]]] = None,
                 input_artifact_details: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeInputArtifactDetailsArgs']]] = None,
                 output_artifact_details: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeOutputArtifactDetailsArgs']]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 settings: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeSettingsArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a CodeDeploy CustomActionType

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codepipeline.CustomActionType("example",
            category="Build",
            input_artifact_details=aws.codepipeline.CustomActionTypeInputArtifactDetailsArgs(
                maximum_count=1,
                minimum_count=0,
            ),
            output_artifact_details=aws.codepipeline.CustomActionTypeOutputArtifactDetailsArgs(
                maximum_count=1,
                minimum_count=0,
            ),
            provider_name="example",
            version="1")
        ```

        ## Import

        Using `pulumi import`, import CodeDeploy CustomActionType using the `id`. For example:

        ```sh
        $ pulumi import aws:codepipeline/customActionType:CustomActionType example Build:pulumi:1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] category: The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomActionTypeConfigurationPropertyArgs']]]] configuration_properties: The configuration properties for the custom action. Max 10 items.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomActionTypeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a CodeDeploy CustomActionType

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codepipeline.CustomActionType("example",
            category="Build",
            input_artifact_details=aws.codepipeline.CustomActionTypeInputArtifactDetailsArgs(
                maximum_count=1,
                minimum_count=0,
            ),
            output_artifact_details=aws.codepipeline.CustomActionTypeOutputArtifactDetailsArgs(
                maximum_count=1,
                minimum_count=0,
            ),
            provider_name="example",
            version="1")
        ```

        ## Import

        Using `pulumi import`, import CodeDeploy CustomActionType using the `id`. For example:

        ```sh
        $ pulumi import aws:codepipeline/customActionType:CustomActionType example Build:pulumi:1
        ```

        :param str resource_name: The name of the resource.
        :param CustomActionTypeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomActionTypeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 category: Optional[pulumi.Input[str]] = None,
                 configuration_properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomActionTypeConfigurationPropertyArgs']]]]] = None,
                 input_artifact_details: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeInputArtifactDetailsArgs']]] = None,
                 output_artifact_details: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeOutputArtifactDetailsArgs']]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 settings: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeSettingsArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomActionTypeArgs.__new__(CustomActionTypeArgs)

            if category is None and not opts.urn:
                raise TypeError("Missing required property 'category'")
            __props__.__dict__["category"] = category
            __props__.__dict__["configuration_properties"] = configuration_properties
            if input_artifact_details is None and not opts.urn:
                raise TypeError("Missing required property 'input_artifact_details'")
            __props__.__dict__["input_artifact_details"] = input_artifact_details
            if output_artifact_details is None and not opts.urn:
                raise TypeError("Missing required property 'output_artifact_details'")
            __props__.__dict__["output_artifact_details"] = output_artifact_details
            if provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'provider_name'")
            __props__.__dict__["provider_name"] = provider_name
            __props__.__dict__["settings"] = settings
            __props__.__dict__["tags"] = tags
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            __props__.__dict__["arn"] = None
            __props__.__dict__["owner"] = None
            __props__.__dict__["tags_all"] = None
        super(CustomActionType, __self__).__init__(
            'aws:codepipeline/customActionType:CustomActionType',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            category: Optional[pulumi.Input[str]] = None,
            configuration_properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomActionTypeConfigurationPropertyArgs']]]]] = None,
            input_artifact_details: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeInputArtifactDetailsArgs']]] = None,
            output_artifact_details: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeOutputArtifactDetailsArgs']]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None,
            settings: Optional[pulumi.Input[pulumi.InputType['CustomActionTypeSettingsArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'CustomActionType':
        """
        Get an existing CustomActionType resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The action ARN.
        :param pulumi.Input[str] category: The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomActionTypeConfigurationPropertyArgs']]]] configuration_properties: The configuration properties for the custom action. Max 10 items.
        :param pulumi.Input[str] owner: The creator of the action being called.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomActionTypeState.__new__(_CustomActionTypeState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["category"] = category
        __props__.__dict__["configuration_properties"] = configuration_properties
        __props__.__dict__["input_artifact_details"] = input_artifact_details
        __props__.__dict__["output_artifact_details"] = output_artifact_details
        __props__.__dict__["owner"] = owner
        __props__.__dict__["provider_name"] = provider_name
        __props__.__dict__["settings"] = settings
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["version"] = version
        return CustomActionType(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The action ARN.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def category(self) -> pulumi.Output[str]:
        """
        The category of the custom action. Valid values: `Source`, `Build`, `Deploy`, `Test`, `Invoke`, `Approval`
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="configurationProperties")
    def configuration_properties(self) -> pulumi.Output[Optional[Sequence['outputs.CustomActionTypeConfigurationProperty']]]:
        """
        The configuration properties for the custom action. Max 10 items.
        """
        return pulumi.get(self, "configuration_properties")

    @property
    @pulumi.getter(name="inputArtifactDetails")
    def input_artifact_details(self) -> pulumi.Output['outputs.CustomActionTypeInputArtifactDetails']:
        return pulumi.get(self, "input_artifact_details")

    @property
    @pulumi.getter(name="outputArtifactDetails")
    def output_artifact_details(self) -> pulumi.Output['outputs.CustomActionTypeOutputArtifactDetails']:
        return pulumi.get(self, "output_artifact_details")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        The creator of the action being called.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "provider_name")

    @property
    @pulumi.getter
    def settings(self) -> pulumi.Output[Optional['outputs.CustomActionTypeSettings']]:
        return pulumi.get(self, "settings")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        return pulumi.get(self, "version")

