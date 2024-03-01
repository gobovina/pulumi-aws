# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ComponentArgs', 'Component']

@pulumi.input_type
class ComponentArgs:
    def __init__(__self__, *,
                 platform: pulumi.Input[str],
                 version: pulumi.Input[str],
                 change_description: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 skip_destroy: Optional[pulumi.Input[bool]] = None,
                 supported_os_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 uri: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Component resource.
        :param pulumi.Input[str] platform: Platform of the component.
        :param pulumi.Input[str] version: Version of the component.
               
               The following attributes are optional:
        :param pulumi.Input[str] change_description: Change description of the component.
        :param pulumi.Input[str] data: Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        :param pulumi.Input[str] description: Description of the component.
        :param pulumi.Input[str] kms_key_id: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        :param pulumi.Input[str] name: Name of the component.
        :param pulumi.Input[bool] skip_destroy: Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] supported_os_versions: Set of Operating Systems (OS) supported by the component.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] uri: S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
               
               > **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        """
        pulumi.set(__self__, "platform", platform)
        pulumi.set(__self__, "version", version)
        if change_description is not None:
            pulumi.set(__self__, "change_description", change_description)
        if data is not None:
            pulumi.set(__self__, "data", data)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if skip_destroy is not None:
            pulumi.set(__self__, "skip_destroy", skip_destroy)
        if supported_os_versions is not None:
            pulumi.set(__self__, "supported_os_versions", supported_os_versions)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)

    @property
    @pulumi.getter
    def platform(self) -> pulumi.Input[str]:
        """
        Platform of the component.
        """
        return pulumi.get(self, "platform")

    @platform.setter
    def platform(self, value: pulumi.Input[str]):
        pulumi.set(self, "platform", value)

    @property
    @pulumi.getter
    def version(self) -> pulumi.Input[str]:
        """
        Version of the component.

        The following attributes are optional:
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: pulumi.Input[str]):
        pulumi.set(self, "version", value)

    @property
    @pulumi.getter(name="changeDescription")
    def change_description(self) -> Optional[pulumi.Input[str]]:
        """
        Change description of the component.
        """
        return pulumi.get(self, "change_description")

    @change_description.setter
    def change_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "change_description", value)

    @property
    @pulumi.getter
    def data(self) -> Optional[pulumi.Input[str]]:
        """
        Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the component.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the component.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="skipDestroy")
    def skip_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        """
        return pulumi.get(self, "skip_destroy")

    @skip_destroy.setter
    def skip_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_destroy", value)

    @property
    @pulumi.getter(name="supportedOsVersions")
    def supported_os_versions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of Operating Systems (OS) supported by the component.
        """
        return pulumi.get(self, "supported_os_versions")

    @supported_os_versions.setter
    def supported_os_versions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "supported_os_versions", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.

        > **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)


@pulumi.input_type
class _ComponentState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 change_description: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[str]] = None,
                 date_created: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 encrypted: Optional[pulumi.Input[bool]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 platform: Optional[pulumi.Input[str]] = None,
                 skip_destroy: Optional[pulumi.Input[bool]] = None,
                 supported_os_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Component resources.
        :param pulumi.Input[str] arn: (Required) Amazon Resource Name (ARN) of the component.
        :param pulumi.Input[str] change_description: Change description of the component.
        :param pulumi.Input[str] data: Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        :param pulumi.Input[str] date_created: Date the component was created.
        :param pulumi.Input[str] description: Description of the component.
        :param pulumi.Input[bool] encrypted: Encryption status of the component.
        :param pulumi.Input[str] kms_key_id: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        :param pulumi.Input[str] name: Name of the component.
        :param pulumi.Input[str] owner: Owner of the component.
        :param pulumi.Input[str] platform: Platform of the component.
        :param pulumi.Input[bool] skip_destroy: Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] supported_os_versions: Set of Operating Systems (OS) supported by the component.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: Type of the component.
        :param pulumi.Input[str] uri: S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
               
               > **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        :param pulumi.Input[str] version: Version of the component.
               
               The following attributes are optional:
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if change_description is not None:
            pulumi.set(__self__, "change_description", change_description)
        if data is not None:
            pulumi.set(__self__, "data", data)
        if date_created is not None:
            pulumi.set(__self__, "date_created", date_created)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if encrypted is not None:
            pulumi.set(__self__, "encrypted", encrypted)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if platform is not None:
            pulumi.set(__self__, "platform", platform)
        if skip_destroy is not None:
            pulumi.set(__self__, "skip_destroy", skip_destroy)
        if supported_os_versions is not None:
            pulumi.set(__self__, "supported_os_versions", supported_os_versions)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if uri is not None:
            pulumi.set(__self__, "uri", uri)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        (Required) Amazon Resource Name (ARN) of the component.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="changeDescription")
    def change_description(self) -> Optional[pulumi.Input[str]]:
        """
        Change description of the component.
        """
        return pulumi.get(self, "change_description")

    @change_description.setter
    def change_description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "change_description", value)

    @property
    @pulumi.getter
    def data(self) -> Optional[pulumi.Input[str]]:
        """
        Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        """
        return pulumi.get(self, "data")

    @data.setter
    def data(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data", value)

    @property
    @pulumi.getter(name="dateCreated")
    def date_created(self) -> Optional[pulumi.Input[str]]:
        """
        Date the component was created.
        """
        return pulumi.get(self, "date_created")

    @date_created.setter
    def date_created(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "date_created", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the component.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def encrypted(self) -> Optional[pulumi.Input[bool]]:
        """
        Encryption status of the component.
        """
        return pulumi.get(self, "encrypted")

    @encrypted.setter
    def encrypted(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "encrypted", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the component.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Owner of the component.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter
    def platform(self) -> Optional[pulumi.Input[str]]:
        """
        Platform of the component.
        """
        return pulumi.get(self, "platform")

    @platform.setter
    def platform(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "platform", value)

    @property
    @pulumi.getter(name="skipDestroy")
    def skip_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        """
        return pulumi.get(self, "skip_destroy")

    @skip_destroy.setter
    def skip_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_destroy", value)

    @property
    @pulumi.getter(name="supportedOsVersions")
    def supported_os_versions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of Operating Systems (OS) supported by the component.
        """
        return pulumi.get(self, "supported_os_versions")

    @supported_os_versions.setter
    def supported_os_versions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "supported_os_versions", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the component.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def uri(self) -> Optional[pulumi.Input[str]]:
        """
        S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.

        > **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        """
        return pulumi.get(self, "uri")

    @uri.setter
    def uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uri", value)

    @property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[str]]:
        """
        Version of the component.

        The following attributes are optional:
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "version", value)


class Component(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_description: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 platform: Optional[pulumi.Input[str]] = None,
                 skip_destroy: Optional[pulumi.Input[bool]] = None,
                 supported_os_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an Image Builder Component.

        ## Example Usage
        ### Inline Data Document

        ```python
        import pulumi
        import pulumi_aws as aws


        def not_implemented(msg):
            raise NotImplementedError(msg)

        example = aws.imagebuilder.Component("example",
            data=not_implemented(\"\"\"yamlencode({
        phases=[{
        name="build"
        steps=[{
        action="ExecuteBash"
        inputs={
        commands=["echo 'hello world'"]
        }
        name="example"
        onFailure="Continue"
        }]
        }]
        schemaVersion=1.0
        })\"\"\"),
            name="example",
            platform="Linux",
            version="1.0.0")
        ```
        ### URI Document

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.imagebuilder.Component("example",
            name="example",
            platform="Linux",
            uri=f"s3://{example_aws_s3_object['bucket']}/{example_aws_s3_object['key']}",
            version="1.0.0")
        ```

        ## Import

        Using `pulumi import`, import `aws_imagebuilder_components` resources using the Amazon Resource Name (ARN). For example:

        ```sh
         $ pulumi import aws:imagebuilder/component:Component example arn:aws:imagebuilder:us-east-1:123456789012:component/example/1.0.0/1
        ```
         Certain resource arguments, such as `uri`, cannot be read via the API and imported into the provider. The provider will display a difference for these arguments the first run after import if declared in the the provider configuration for an imported resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] change_description: Change description of the component.
        :param pulumi.Input[str] data: Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        :param pulumi.Input[str] description: Description of the component.
        :param pulumi.Input[str] kms_key_id: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        :param pulumi.Input[str] name: Name of the component.
        :param pulumi.Input[str] platform: Platform of the component.
        :param pulumi.Input[bool] skip_destroy: Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] supported_os_versions: Set of Operating Systems (OS) supported by the component.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[str] uri: S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
               
               > **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        :param pulumi.Input[str] version: Version of the component.
               
               The following attributes are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ComponentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Image Builder Component.

        ## Example Usage
        ### Inline Data Document

        ```python
        import pulumi
        import pulumi_aws as aws


        def not_implemented(msg):
            raise NotImplementedError(msg)

        example = aws.imagebuilder.Component("example",
            data=not_implemented(\"\"\"yamlencode({
        phases=[{
        name="build"
        steps=[{
        action="ExecuteBash"
        inputs={
        commands=["echo 'hello world'"]
        }
        name="example"
        onFailure="Continue"
        }]
        }]
        schemaVersion=1.0
        })\"\"\"),
            name="example",
            platform="Linux",
            version="1.0.0")
        ```
        ### URI Document

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.imagebuilder.Component("example",
            name="example",
            platform="Linux",
            uri=f"s3://{example_aws_s3_object['bucket']}/{example_aws_s3_object['key']}",
            version="1.0.0")
        ```

        ## Import

        Using `pulumi import`, import `aws_imagebuilder_components` resources using the Amazon Resource Name (ARN). For example:

        ```sh
         $ pulumi import aws:imagebuilder/component:Component example arn:aws:imagebuilder:us-east-1:123456789012:component/example/1.0.0/1
        ```
         Certain resource arguments, such as `uri`, cannot be read via the API and imported into the provider. The provider will display a difference for these arguments the first run after import if declared in the the provider configuration for an imported resource.

        :param str resource_name: The name of the resource.
        :param ComponentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ComponentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_description: Optional[pulumi.Input[str]] = None,
                 data: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 platform: Optional[pulumi.Input[str]] = None,
                 skip_destroy: Optional[pulumi.Input[bool]] = None,
                 supported_os_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 uri: Optional[pulumi.Input[str]] = None,
                 version: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ComponentArgs.__new__(ComponentArgs)

            __props__.__dict__["change_description"] = change_description
            __props__.__dict__["data"] = data
            __props__.__dict__["description"] = description
            __props__.__dict__["kms_key_id"] = kms_key_id
            __props__.__dict__["name"] = name
            if platform is None and not opts.urn:
                raise TypeError("Missing required property 'platform'")
            __props__.__dict__["platform"] = platform
            __props__.__dict__["skip_destroy"] = skip_destroy
            __props__.__dict__["supported_os_versions"] = supported_os_versions
            __props__.__dict__["tags"] = tags
            __props__.__dict__["uri"] = uri
            if version is None and not opts.urn:
                raise TypeError("Missing required property 'version'")
            __props__.__dict__["version"] = version
            __props__.__dict__["arn"] = None
            __props__.__dict__["date_created"] = None
            __props__.__dict__["encrypted"] = None
            __props__.__dict__["owner"] = None
            __props__.__dict__["tags_all"] = None
            __props__.__dict__["type"] = None
        super(Component, __self__).__init__(
            'aws:imagebuilder/component:Component',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            change_description: Optional[pulumi.Input[str]] = None,
            data: Optional[pulumi.Input[str]] = None,
            date_created: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            encrypted: Optional[pulumi.Input[bool]] = None,
            kms_key_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            platform: Optional[pulumi.Input[str]] = None,
            skip_destroy: Optional[pulumi.Input[bool]] = None,
            supported_os_versions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            uri: Optional[pulumi.Input[str]] = None,
            version: Optional[pulumi.Input[str]] = None) -> 'Component':
        """
        Get an existing Component resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: (Required) Amazon Resource Name (ARN) of the component.
        :param pulumi.Input[str] change_description: Change description of the component.
        :param pulumi.Input[str] data: Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        :param pulumi.Input[str] date_created: Date the component was created.
        :param pulumi.Input[str] description: Description of the component.
        :param pulumi.Input[bool] encrypted: Encryption status of the component.
        :param pulumi.Input[str] kms_key_id: Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        :param pulumi.Input[str] name: Name of the component.
        :param pulumi.Input[str] owner: Owner of the component.
        :param pulumi.Input[str] platform: Platform of the component.
        :param pulumi.Input[bool] skip_destroy: Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] supported_os_versions: Set of Operating Systems (OS) supported by the component.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        :param pulumi.Input[str] type: Type of the component.
        :param pulumi.Input[str] uri: S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
               
               > **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        :param pulumi.Input[str] version: Version of the component.
               
               The following attributes are optional:
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ComponentState.__new__(_ComponentState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["change_description"] = change_description
        __props__.__dict__["data"] = data
        __props__.__dict__["date_created"] = date_created
        __props__.__dict__["description"] = description
        __props__.__dict__["encrypted"] = encrypted
        __props__.__dict__["kms_key_id"] = kms_key_id
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["platform"] = platform
        __props__.__dict__["skip_destroy"] = skip_destroy
        __props__.__dict__["supported_os_versions"] = supported_os_versions
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        __props__.__dict__["type"] = type
        __props__.__dict__["uri"] = uri
        __props__.__dict__["version"] = version
        return Component(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        (Required) Amazon Resource Name (ARN) of the component.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="changeDescription")
    def change_description(self) -> pulumi.Output[Optional[str]]:
        """
        Change description of the component.
        """
        return pulumi.get(self, "change_description")

    @property
    @pulumi.getter
    def data(self) -> pulumi.Output[str]:
        """
        Inline YAML string with data of the component. Exactly one of `data` and `uri` can be specified. the provider will only perform drift detection of its value when present in a configuration.
        """
        return pulumi.get(self, "data")

    @property
    @pulumi.getter(name="dateCreated")
    def date_created(self) -> pulumi.Output[str]:
        """
        Date the component was created.
        """
        return pulumi.get(self, "date_created")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the component.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def encrypted(self) -> pulumi.Output[bool]:
        """
        Encryption status of the component.
        """
        return pulumi.get(self, "encrypted")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Output[Optional[str]]:
        """
        Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the component.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Owner of the component.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def platform(self) -> pulumi.Output[str]:
        """
        Platform of the component.
        """
        return pulumi.get(self, "platform")

    @property
    @pulumi.getter(name="skipDestroy")
    def skip_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to retain the old version when the resource is destroyed or replacement is necessary. Defaults to `false`.
        """
        return pulumi.get(self, "skip_destroy")

    @property
    @pulumi.getter(name="supportedOsVersions")
    def supported_os_versions(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Set of Operating Systems (OS) supported by the component.
        """
        return pulumi.get(self, "supported_os_versions")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags for the component. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of the component.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def uri(self) -> pulumi.Output[Optional[str]]:
        """
        S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.

        > **NOTE:** Updating `data` or `uri` requires specifying a new `version`. This causes replacement of the resource. The `skip_destroy` argument can be used to retain the old version.
        """
        return pulumi.get(self, "uri")

    @property
    @pulumi.getter
    def version(self) -> pulumi.Output[str]:
        """
        Version of the component.

        The following attributes are optional:
        """
        return pulumi.get(self, "version")

