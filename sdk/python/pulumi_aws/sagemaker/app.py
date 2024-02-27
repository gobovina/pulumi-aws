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

__all__ = ['AppArgs', 'App']

@pulumi.input_type
class AppArgs:
    def __init__(__self__, *,
                 app_name: pulumi.Input[str],
                 app_type: pulumi.Input[str],
                 domain_id: pulumi.Input[str],
                 resource_spec: Optional[pulumi.Input['AppResourceSpecArgs']] = None,
                 space_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_profile_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a App resource.
        :param pulumi.Input[str] app_name: The name of the app.
        :param pulumi.Input[str] app_type: The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
        :param pulumi.Input[str] domain_id: The domain ID.
        :param pulumi.Input['AppResourceSpecArgs'] resource_spec: The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        :param pulumi.Input[str] space_name: The name of the space. At least one of `user_profile_name` or `space_name` required.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] user_profile_name: The user profile name. At least one of `user_profile_name` or `space_name` required.
        """
        pulumi.set(__self__, "app_name", app_name)
        pulumi.set(__self__, "app_type", app_type)
        pulumi.set(__self__, "domain_id", domain_id)
        if resource_spec is not None:
            pulumi.set(__self__, "resource_spec", resource_spec)
        if space_name is not None:
            pulumi.set(__self__, "space_name", space_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if user_profile_name is not None:
            pulumi.set(__self__, "user_profile_name", user_profile_name)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> pulumi.Input[str]:
        """
        The name of the app.
        """
        return pulumi.get(self, "app_name")

    @app_name.setter
    def app_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_name", value)

    @property
    @pulumi.getter(name="appType")
    def app_type(self) -> pulumi.Input[str]:
        """
        The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
        """
        return pulumi.get(self, "app_type")

    @app_type.setter
    def app_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_type", value)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Input[str]:
        """
        The domain ID.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="resourceSpec")
    def resource_spec(self) -> Optional[pulumi.Input['AppResourceSpecArgs']]:
        """
        The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        """
        return pulumi.get(self, "resource_spec")

    @resource_spec.setter
    def resource_spec(self, value: Optional[pulumi.Input['AppResourceSpecArgs']]):
        pulumi.set(self, "resource_spec", value)

    @property
    @pulumi.getter(name="spaceName")
    def space_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the space. At least one of `user_profile_name` or `space_name` required.
        """
        return pulumi.get(self, "space_name")

    @space_name.setter
    def space_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "space_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="userProfileName")
    def user_profile_name(self) -> Optional[pulumi.Input[str]]:
        """
        The user profile name. At least one of `user_profile_name` or `space_name` required.
        """
        return pulumi.get(self, "user_profile_name")

    @user_profile_name.setter
    def user_profile_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_profile_name", value)


@pulumi.input_type
class _AppState:
    def __init__(__self__, *,
                 app_name: Optional[pulumi.Input[str]] = None,
                 app_type: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 resource_spec: Optional[pulumi.Input['AppResourceSpecArgs']] = None,
                 space_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_profile_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering App resources.
        :param pulumi.Input[str] app_name: The name of the app.
        :param pulumi.Input[str] app_type: The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the app.
        :param pulumi.Input[str] domain_id: The domain ID.
        :param pulumi.Input['AppResourceSpecArgs'] resource_spec: The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        :param pulumi.Input[str] space_name: The name of the space. At least one of `user_profile_name` or `space_name` required.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] user_profile_name: The user profile name. At least one of `user_profile_name` or `space_name` required.
        """
        if app_name is not None:
            pulumi.set(__self__, "app_name", app_name)
        if app_type is not None:
            pulumi.set(__self__, "app_type", app_type)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if domain_id is not None:
            pulumi.set(__self__, "domain_id", domain_id)
        if resource_spec is not None:
            pulumi.set(__self__, "resource_spec", resource_spec)
        if space_name is not None:
            pulumi.set(__self__, "space_name", space_name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if user_profile_name is not None:
            pulumi.set(__self__, "user_profile_name", user_profile_name)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the app.
        """
        return pulumi.get(self, "app_name")

    @app_name.setter
    def app_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_name", value)

    @property
    @pulumi.getter(name="appType")
    def app_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
        """
        return pulumi.get(self, "app_type")

    @app_type.setter
    def app_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_type", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the app.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> Optional[pulumi.Input[str]]:
        """
        The domain ID.
        """
        return pulumi.get(self, "domain_id")

    @domain_id.setter
    def domain_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain_id", value)

    @property
    @pulumi.getter(name="resourceSpec")
    def resource_spec(self) -> Optional[pulumi.Input['AppResourceSpecArgs']]:
        """
        The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        """
        return pulumi.get(self, "resource_spec")

    @resource_spec.setter
    def resource_spec(self, value: Optional[pulumi.Input['AppResourceSpecArgs']]):
        pulumi.set(self, "resource_spec", value)

    @property
    @pulumi.getter(name="spaceName")
    def space_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the space. At least one of `user_profile_name` or `space_name` required.
        """
        return pulumi.get(self, "space_name")

    @space_name.setter
    def space_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "space_name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)

    @property
    @pulumi.getter(name="userProfileName")
    def user_profile_name(self) -> Optional[pulumi.Input[str]]:
        """
        The user profile name. At least one of `user_profile_name` or `space_name` required.
        """
        return pulumi.get(self, "user_profile_name")

    @user_profile_name.setter
    def user_profile_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_profile_name", value)


class App(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 app_type: Optional[pulumi.Input[str]] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 resource_spec: Optional[pulumi.Input[pulumi.InputType['AppResourceSpecArgs']]] = None,
                 space_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_profile_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a SageMaker App resource.

        ## Example Usage
        ### Basic usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sagemaker.App("example",
            domain_id=aws_sagemaker_domain["example"]["id"],
            user_profile_name=aws_sagemaker_user_profile["example"]["user_profile_name"],
            app_name="example",
            app_type="JupyterServer")
        ```

        ## Import

        Using `pulumi import`, import SageMaker Apps using the `id`. For example:

        ```sh
         $ pulumi import aws:sagemaker/app:App example arn:aws:sagemaker:us-west-2:012345678912:app/domain-id/user-profile-name/app-type/app-name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_name: The name of the app.
        :param pulumi.Input[str] app_type: The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
        :param pulumi.Input[str] domain_id: The domain ID.
        :param pulumi.Input[pulumi.InputType['AppResourceSpecArgs']] resource_spec: The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        :param pulumi.Input[str] space_name: The name of the space. At least one of `user_profile_name` or `space_name` required.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] user_profile_name: The user profile name. At least one of `user_profile_name` or `space_name` required.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a SageMaker App resource.

        ## Example Usage
        ### Basic usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sagemaker.App("example",
            domain_id=aws_sagemaker_domain["example"]["id"],
            user_profile_name=aws_sagemaker_user_profile["example"]["user_profile_name"],
            app_name="example",
            app_type="JupyterServer")
        ```

        ## Import

        Using `pulumi import`, import SageMaker Apps using the `id`. For example:

        ```sh
         $ pulumi import aws:sagemaker/app:App example arn:aws:sagemaker:us-west-2:012345678912:app/domain-id/user-profile-name/app-type/app-name
        ```

        :param str resource_name: The name of the resource.
        :param AppArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_name: Optional[pulumi.Input[str]] = None,
                 app_type: Optional[pulumi.Input[str]] = None,
                 domain_id: Optional[pulumi.Input[str]] = None,
                 resource_spec: Optional[pulumi.Input[pulumi.InputType['AppResourceSpecArgs']]] = None,
                 space_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 user_profile_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppArgs.__new__(AppArgs)

            if app_name is None and not opts.urn:
                raise TypeError("Missing required property 'app_name'")
            __props__.__dict__["app_name"] = app_name
            if app_type is None and not opts.urn:
                raise TypeError("Missing required property 'app_type'")
            __props__.__dict__["app_type"] = app_type
            if domain_id is None and not opts.urn:
                raise TypeError("Missing required property 'domain_id'")
            __props__.__dict__["domain_id"] = domain_id
            __props__.__dict__["resource_spec"] = resource_spec
            __props__.__dict__["space_name"] = space_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["user_profile_name"] = user_profile_name
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(App, __self__).__init__(
            'aws:sagemaker/app:App',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_name: Optional[pulumi.Input[str]] = None,
            app_type: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            domain_id: Optional[pulumi.Input[str]] = None,
            resource_spec: Optional[pulumi.Input[pulumi.InputType['AppResourceSpecArgs']]] = None,
            space_name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            user_profile_name: Optional[pulumi.Input[str]] = None) -> 'App':
        """
        Get an existing App resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_name: The name of the app.
        :param pulumi.Input[str] app_type: The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the app.
        :param pulumi.Input[str] domain_id: The domain ID.
        :param pulumi.Input[pulumi.InputType['AppResourceSpecArgs']] resource_spec: The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        :param pulumi.Input[str] space_name: The name of the space. At least one of `user_profile_name` or `space_name` required.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] user_profile_name: The user profile name. At least one of `user_profile_name` or `space_name` required.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppState.__new__(_AppState)

        __props__.__dict__["app_name"] = app_name
        __props__.__dict__["app_type"] = app_type
        __props__.__dict__["arn"] = arn
        __props__.__dict__["domain_id"] = domain_id
        __props__.__dict__["resource_spec"] = resource_spec
        __props__.__dict__["space_name"] = space_name
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["user_profile_name"] = user_profile_name
        return App(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appName")
    def app_name(self) -> pulumi.Output[str]:
        """
        The name of the app.
        """
        return pulumi.get(self, "app_name")

    @property
    @pulumi.getter(name="appType")
    def app_type(self) -> pulumi.Output[str]:
        """
        The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
        """
        return pulumi.get(self, "app_type")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the app.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="domainId")
    def domain_id(self) -> pulumi.Output[str]:
        """
        The domain ID.
        """
        return pulumi.get(self, "domain_id")

    @property
    @pulumi.getter(name="resourceSpec")
    def resource_spec(self) -> pulumi.Output['outputs.AppResourceSpec']:
        """
        The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
        """
        return pulumi.get(self, "resource_spec")

    @property
    @pulumi.getter(name="spaceName")
    def space_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the space. At least one of `user_profile_name` or `space_name` required.
        """
        return pulumi.get(self, "space_name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @property
    @pulumi.getter(name="userProfileName")
    def user_profile_name(self) -> pulumi.Output[Optional[str]]:
        """
        The user profile name. At least one of `user_profile_name` or `space_name` required.
        """
        return pulumi.get(self, "user_profile_name")

