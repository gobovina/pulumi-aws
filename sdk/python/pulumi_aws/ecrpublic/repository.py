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

__all__ = ['RepositoryArgs', 'Repository']

@pulumi.input_type
class RepositoryArgs:
    def __init__(__self__, *,
                 repository_name: pulumi.Input[str],
                 catalog_data: Optional[pulumi.Input['RepositoryCatalogDataArgs']] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Repository resource.
        :param pulumi.Input[str] repository_name: Name of the repository.
        :param pulumi.Input['RepositoryCatalogDataArgs'] catalog_data: Catalog data configuration for the repository. See below for schema.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "repository_name", repository_name)
        if catalog_data is not None:
            pulumi.set(__self__, "catalog_data", catalog_data)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> pulumi.Input[str]:
        """
        Name of the repository.
        """
        return pulumi.get(self, "repository_name")

    @repository_name.setter
    def repository_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository_name", value)

    @property
    @pulumi.getter(name="catalogData")
    def catalog_data(self) -> Optional[pulumi.Input['RepositoryCatalogDataArgs']]:
        """
        Catalog data configuration for the repository. See below for schema.
        """
        return pulumi.get(self, "catalog_data")

    @catalog_data.setter
    def catalog_data(self, value: Optional[pulumi.Input['RepositoryCatalogDataArgs']]):
        pulumi.set(self, "catalog_data", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _RepositoryState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 catalog_data: Optional[pulumi.Input['RepositoryCatalogDataArgs']] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 registry_id: Optional[pulumi.Input[str]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None,
                 repository_uri: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Repository resources.
        :param pulumi.Input[str] arn: Full ARN of the repository.
        :param pulumi.Input['RepositoryCatalogDataArgs'] catalog_data: Catalog data configuration for the repository. See below for schema.
        :param pulumi.Input[str] registry_id: The registry ID where the repository was created.
        :param pulumi.Input[str] repository_name: Name of the repository.
        :param pulumi.Input[str] repository_uri: The URI of the repository.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if catalog_data is not None:
            pulumi.set(__self__, "catalog_data", catalog_data)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if registry_id is not None:
            pulumi.set(__self__, "registry_id", registry_id)
        if repository_name is not None:
            pulumi.set(__self__, "repository_name", repository_name)
        if repository_uri is not None:
            pulumi.set(__self__, "repository_uri", repository_uri)
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
        Full ARN of the repository.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="catalogData")
    def catalog_data(self) -> Optional[pulumi.Input['RepositoryCatalogDataArgs']]:
        """
        Catalog data configuration for the repository. See below for schema.
        """
        return pulumi.get(self, "catalog_data")

    @catalog_data.setter
    def catalog_data(self, value: Optional[pulumi.Input['RepositoryCatalogDataArgs']]):
        pulumi.set(self, "catalog_data", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

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
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the repository.
        """
        return pulumi.get(self, "repository_name")

    @repository_name.setter
    def repository_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository_name", value)

    @property
    @pulumi.getter(name="repositoryUri")
    def repository_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The URI of the repository.
        """
        return pulumi.get(self, "repository_uri")

    @repository_uri.setter
    def repository_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository_uri", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class Repository(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_data: Optional[pulumi.Input[pulumi.InputType['RepositoryCatalogDataArgs']]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Public Elastic Container Registry Repository.

        > **NOTE:** This resource can only be used in the `us-east-1` region.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_aws as aws

        us_east1 = aws.Provider("usEast1", region="us-east-1")
        foo = aws.ecrpublic.Repository("foo",
            repository_name="bar",
            catalog_data=aws.ecrpublic.RepositoryCatalogDataArgs(
                about_text="About Text",
                architectures=["ARM"],
                description="Description",
                logo_image_blob=(lambda path: base64.b64encode(open(path).read().encode()).decode())(image["png"]),
                operating_systems=["Linux"],
                usage_text="Usage Text",
            ),
            tags={
                "env": "production",
            },
            opts=pulumi.ResourceOptions(provider=aws["us_east_1"]))
        ```

        ## Import

        Using `pulumi import`, import ECR Public Repositories using the `repository_name`. For example:

        ```sh
         $ pulumi import aws:ecrpublic/repository:Repository example example
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['RepositoryCatalogDataArgs']] catalog_data: Catalog data configuration for the repository. See below for schema.
        :param pulumi.Input[str] repository_name: Name of the repository.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RepositoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Public Elastic Container Registry Repository.

        > **NOTE:** This resource can only be used in the `us-east-1` region.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_aws as aws

        us_east1 = aws.Provider("usEast1", region="us-east-1")
        foo = aws.ecrpublic.Repository("foo",
            repository_name="bar",
            catalog_data=aws.ecrpublic.RepositoryCatalogDataArgs(
                about_text="About Text",
                architectures=["ARM"],
                description="Description",
                logo_image_blob=(lambda path: base64.b64encode(open(path).read().encode()).decode())(image["png"]),
                operating_systems=["Linux"],
                usage_text="Usage Text",
            ),
            tags={
                "env": "production",
            },
            opts=pulumi.ResourceOptions(provider=aws["us_east_1"]))
        ```

        ## Import

        Using `pulumi import`, import ECR Public Repositories using the `repository_name`. For example:

        ```sh
         $ pulumi import aws:ecrpublic/repository:Repository example example
        ```

        :param str resource_name: The name of the resource.
        :param RepositoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RepositoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 catalog_data: Optional[pulumi.Input[pulumi.InputType['RepositoryCatalogDataArgs']]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 repository_name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RepositoryArgs.__new__(RepositoryArgs)

            __props__.__dict__["catalog_data"] = catalog_data
            __props__.__dict__["force_destroy"] = force_destroy
            if repository_name is None and not opts.urn:
                raise TypeError("Missing required property 'repository_name'")
            __props__.__dict__["repository_name"] = repository_name
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["registry_id"] = None
            __props__.__dict__["repository_uri"] = None
            __props__.__dict__["tags_all"] = None
        super(Repository, __self__).__init__(
            'aws:ecrpublic/repository:Repository',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            catalog_data: Optional[pulumi.Input[pulumi.InputType['RepositoryCatalogDataArgs']]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            registry_id: Optional[pulumi.Input[str]] = None,
            repository_name: Optional[pulumi.Input[str]] = None,
            repository_uri: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Repository':
        """
        Get an existing Repository resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Full ARN of the repository.
        :param pulumi.Input[pulumi.InputType['RepositoryCatalogDataArgs']] catalog_data: Catalog data configuration for the repository. See below for schema.
        :param pulumi.Input[str] registry_id: The registry ID where the repository was created.
        :param pulumi.Input[str] repository_name: Name of the repository.
        :param pulumi.Input[str] repository_uri: The URI of the repository.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RepositoryState.__new__(_RepositoryState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["catalog_data"] = catalog_data
        __props__.__dict__["force_destroy"] = force_destroy
        __props__.__dict__["registry_id"] = registry_id
        __props__.__dict__["repository_name"] = repository_name
        __props__.__dict__["repository_uri"] = repository_uri
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Repository(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Full ARN of the repository.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="catalogData")
    def catalog_data(self) -> pulumi.Output[Optional['outputs.RepositoryCatalogData']]:
        """
        Catalog data configuration for the repository. See below for schema.
        """
        return pulumi.get(self, "catalog_data")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter(name="registryId")
    def registry_id(self) -> pulumi.Output[str]:
        """
        The registry ID where the repository was created.
        """
        return pulumi.get(self, "registry_id")

    @property
    @pulumi.getter(name="repositoryName")
    def repository_name(self) -> pulumi.Output[str]:
        """
        Name of the repository.
        """
        return pulumi.get(self, "repository_name")

    @property
    @pulumi.getter(name="repositoryUri")
    def repository_uri(self) -> pulumi.Output[str]:
        """
        The URI of the repository.
        """
        return pulumi.get(self, "repository_uri")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

